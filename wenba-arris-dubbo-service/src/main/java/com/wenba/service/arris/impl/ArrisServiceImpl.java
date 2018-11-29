package com.wenba.service.arris.impl;

import com.wenba.common.domain.ArrisInfo;
import com.wenba.reposity.arris.ArrisInfoDao;
import com.wenba.service.arris.ArrisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("arrisService")
public class ArrisServiceImpl implements ArrisService {

    @Autowired
    private ArrisInfoDao arrisInfoDao;


    //获取表达式列表总记录数量
    @Override
    public int selArrisInfoListNum(ArrisInfo ai) {
        return arrisInfoDao.selArrisInfoListNum(ai);
    }

    //查询表达式列表
    @Override
    public List<ArrisInfo> selArrisInfoList(ArrisInfo ai) {
        return arrisInfoDao.selArrisInfoList(ai);
    }

    //查询表达式列表
    @Override
    public int checkArrisVN(ArrisInfo ai) {
        return arrisInfoDao.checkArrisVN(ai);
    }

    //新增表达式
    @Override
    public int insArrisInfoList(ArrisInfo ai) {
        return arrisInfoDao.insArrisInfoList(ai);
    }

    //更新表达式
    @Override
    public int updArrisInfoList(ArrisInfo ai) {
        return arrisInfoDao.updArrisInfoList(ai);
    }

    //删除表达式
    @Override
    public int delArrisInfoList(ArrisInfo ai) {
        return arrisInfoDao.delArrisInfoList(ai);
    }
}
