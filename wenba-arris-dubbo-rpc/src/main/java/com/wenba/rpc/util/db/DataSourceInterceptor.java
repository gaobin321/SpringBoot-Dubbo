package com.wenba.rpc.util.db;

import com.wenba.common.annotation.Master;
import com.wenba.common.annotation.Slave;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Component
public class DataSourceInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();

        Annotation annotation = method.getAnnotation(Master.class);
        if(annotation == null) {
            annotation = method.getAnnotation(Slave.class);
        }
        if(annotation != null) {
            DynamicDataSource.DataSourceHolder.set(annotation);
        }
        try {
            return invocation.proceed();
        } finally {
            DynamicDataSource.DataSourceHolder.clear();
        }
    }

}
