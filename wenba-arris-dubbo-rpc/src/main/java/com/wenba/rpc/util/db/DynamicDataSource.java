package com.wenba.rpc.util.db;

import com.wenba.common.annotation.Master;
import com.wenba.common.annotation.Slave;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.lang.annotation.Annotation;
import java.util.concurrent.ThreadLocalRandom;

public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        Annotation annotation = DataSourceHolder.get();
        //默认还是master
        if(annotation == null) {
            return Master.class;
        }
        if(annotation.annotationType() == Master.class) {
            return Master.class;
        }

        return Slave.class;
    }

    public  static class DataSourceHolder {
        private static final ThreadLocal<Annotation> holder = new ThreadLocal<Annotation>();
        public static Annotation get() {
            return holder.get();
        }
        public static void set(Annotation context) {
            holder.set(context);
        }
        public static void clear() {
            holder.remove();
        }
    }
}
