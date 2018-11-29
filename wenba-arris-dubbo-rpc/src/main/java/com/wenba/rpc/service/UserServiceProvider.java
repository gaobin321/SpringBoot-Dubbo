package com.wenba.rpc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wenba.api.UserServiceFacade;
import com.wenba.common.annotation.Master;
import com.wenba.common.domain.User;
import com.wenba.common.vo.UserVo;
import com.wenba.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}",
        group = "${dubbo.provider.group}"
)
public class UserServiceProvider implements UserServiceFacade {

    @Autowired
    UserService userService;

    @Override
    public User queryUserById(Long userId) {
        return userService.queryUserById(userId);
    }

    @Master
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUser(UserVo userVo) throws Exception {
        User user = new User(userVo.getUserId(),userVo.getName());
        userService.addUser(user);

        // mock exception
        if ("TransactionalUncheckError".endsWith(user.getName())){
            int i=0;
            int j=1/i;
        }
        if ("TransactionalCheckError".endsWith(user.getName())){
            throw new Exception("TransactionalCheck ERROR");
        }
    }

    @Override
    public User queryUserCondition(UserVo userVo) {
        return null;
    }
}
