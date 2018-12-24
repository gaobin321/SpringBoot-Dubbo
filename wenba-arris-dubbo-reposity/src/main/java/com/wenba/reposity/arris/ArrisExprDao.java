package com.wenba.reposity.arris;

import com.wenba.common.domain.ArrisExpr;
import com.wenba.common.domain.ArrisInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArrisExprDao {

    int deleteByPrimaryKey(Integer id);

    int insert(ArrisExpr record);

    int insertSelective(ArrisExpr record);

    ArrisExpr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArrisExpr record);

    int updateByPrimaryKey(ArrisExpr record);




    //获取表达式详情列表总记录数量
    int selArrisExprListNum(ArrisExpr ae);

    //查询表达式详情列表
    List<ArrisExpr> selArrisExprList(ArrisExpr ae);

    //查询表达式列表
    int checkArrisVNExprV(ArrisExpr ae);

    //新增表达式详情
    int insArrisExprList(ArrisExpr ae);

    //更新表达式
    int updArrisExprList(ArrisExpr ae);

    //删除表达式
    int delArrisExprList(ArrisExpr ae);

    //检验表达式详情是否存在
    int checkArrisExprID(@Param("id") int id);

    //校验表达式是否改变
    /*int checkArrisDet(@Param("id") Integer id, @Param("arrisDetail") String arrisDetail);*/

    //查询表达式详情版本
    int selArrisExprV(ArrisExpr ae);

    //查询要执行表达式详情
    String selArrisExprDetael(@Param("id")int id);

}