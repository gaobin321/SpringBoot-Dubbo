package com.wenba.common.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserVo implements Serializable {
    private Long userId;
    private String name;
    
}
