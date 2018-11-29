package com.wenba.service.user;

import com.wenba.common.domain.User;

public interface UserService {
    User queryUserById(Long userId);

    void addUser(User user) throws Exception;
}
