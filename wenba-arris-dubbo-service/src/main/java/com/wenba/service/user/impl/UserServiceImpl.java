package com.wenba.service.user.impl;

import com.wenba.common.domain.User;
import com.wenba.reposity.user.UserDao;
import com.wenba.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserById(Long userId) {
        return userDao.selectByPrimaryKey(userId);
//        return new User(123L,"Hello kitty: MOCK");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addUser(User user) throws Exception {
        userDao.insert(user);

    }
}
