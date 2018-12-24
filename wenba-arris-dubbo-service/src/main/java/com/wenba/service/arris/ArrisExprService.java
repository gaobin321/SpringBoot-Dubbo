package com.wenba.service.arris;

import com.wenba.common.domain.ArrisExpr;
import com.wenba.common.utils.base.DataResult;

import java.util.List;
import java.util.Map;

public interface ArrisExprService {

    //获取表达式详情列表总记录数量
    int selArrisExprListNum(ArrisExpr ae);

    //查询表达式详情列表
    List<ArrisExpr> selArrisExprList(ArrisExpr ae);

    //检验表达式版本和表达式名称
    int checkArrisVNExprV(ArrisExpr ae);

    //新增表达式
    int insArrisExprList(ArrisExpr ae);

    //更新表达式
    int updArrisExprList(ArrisExpr ae);

    //删除表达式
    int delArrisExprList(ArrisExpr ae);

    //调用表达式详情
    Map<Integer, DataResult<String>> transArrisExprList(Map<String, Object> map);

    //检验表达式详情是否存在
    int checkArrisExprID(int id);

    //查询表达式详情版本
    int selArrisExprV(ArrisExpr ae);
}
