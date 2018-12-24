package com.wenba.service.arris.impl;

import com.wenba.common.domain.ArrisInfo;
import com.wenba.reposity.arris.ArrisInfoDao;
import com.wenba.service.arris.ArrisInfoService;
import com.wenba.service.expression.ExpressionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("arrisInfoService")
public class ArrisInfoServiceImpl implements ArrisInfoService {

    @Autowired
    private ArrisInfoDao arrisInfoDao;


    private ExpressionFactory factory = ExpressionFactory.getInstance();


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

    //检验表达式版本和表达式名称
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

    //检验表达式是否存在
    @Override
    public int checkArrisID(int id) {
        return arrisInfoDao.checkArrisID(id);
    }


}
