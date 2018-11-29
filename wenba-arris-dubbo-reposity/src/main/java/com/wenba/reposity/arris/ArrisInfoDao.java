package com.wenba.reposity.arris;

import com.wenba.common.domain.ArrisInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArrisInfoDao {

    int deleteByPrimaryKey(Integer id);

    int insert(ArrisInfo record);

    int insertSelective(ArrisInfo record);

    ArrisInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArrisInfo record);

    int updateByPrimaryKey(ArrisInfo record);



    //获取表达式列表总记录数量
    int selArrisInfoListNum(ArrisInfo ai);

    //查询表达式列表
    List<ArrisInfo> selArrisInfoList(ArrisInfo ai);

    //查询表达式列表
    int checkArrisVN(ArrisInfo ai);

    //新增表达式
    int insArrisInfoList(ArrisInfo ai);

    //更新表达式
    int updArrisInfoList(ArrisInfo ai);

    //删除表达式
    int delArrisInfoList(ArrisInfo ai);
}