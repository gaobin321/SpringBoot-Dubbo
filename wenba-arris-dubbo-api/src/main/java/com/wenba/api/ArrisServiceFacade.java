package com.wenba.api;

import com.wenba.common.domain.ArrisInfo;

import java.util.List;

public interface ArrisServiceFacade {


    //获取表达式列表总记录数量
    int selArrisInfoListNum(ArrisInfo ai);

    //查询表达式列表
    List<ArrisInfo> selArrisInfoList(ArrisInfo ai);

    //检验表达式版本和表达式名称
    int checkArrisVN(ArrisInfo ai);

    //新增表达式
    int insArrisInfoList(ArrisInfo ai);

    //更新表达式
    int updArrisInfoList(ArrisInfo ai);

    //删除表达式
    int delArrisInfoList(ArrisInfo ai);

    //调用表达式
    int transArrisInfoList(ArrisInfo ai);
}
