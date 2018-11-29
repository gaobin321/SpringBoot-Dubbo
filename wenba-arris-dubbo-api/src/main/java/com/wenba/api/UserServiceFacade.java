package com.wenba.api;

import com.wenba.common.domain.User;
import com.wenba.common.vo.UserVo;

public interface UserServiceFacade {

    /**
     * 根据ID查询
     * @param userId
     * @return
     */
    User queryUserById(Long userId);

    /**
     * 添加用户
     * @param userVo
     */
    void addUser(UserVo userVo)throws Exception;

    /**
     * 条件过滤
     * @param userVo
     * @return
     */
    User queryUserCondition(UserVo userVo);



}
