package com.wenba.rpc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wenba.api.ArrisInfoServiceFacade;
import com.wenba.common.domain.ArrisInfo;
import com.wenba.common.utils.base.DataResult;
import com.wenba.service.arris.ArrisInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service(
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}",
        group = "${dubbo.provider.group}"
)

public class ArrisInfoServiceProvider implements ArrisInfoServiceFacade {

    @Autowired
    ArrisInfoService arrisService;


    //获取表达式列表总记录数量
    @Override
    public int selArrisInfoListNum(ArrisInfo ai) {
        return arrisService.selArrisInfoListNum(ai);
    }

    //查询表达式列表
    @Override
    public List<ArrisInfo> selArrisInfoList(ArrisInfo ai) {
        return arrisService.selArrisInfoList(ai);
    }

    //检验表达式版本和表达式名称
    @Override
    public int checkArrisVN(ArrisInfo ai) {
        return arrisService.checkArrisVN(ai);
    }

    //新增表达式
    @Override
    public int insArrisInfoList(ArrisInfo ai) {
        return arrisService.insArrisInfoList(ai);
    }

    //更新表达式
    @Override
    public int updArrisInfoList(ArrisInfo ai) {
        return arrisService.updArrisInfoList(ai);
    }

    //删除表达式
    @Override
    public int delArrisInfoList(ArrisInfo ai) {
        return arrisService.delArrisInfoList(ai);
    }

    //检验表达式是否存在
    @Override
    public int checkArrisID(int id) {
        return arrisService.checkArrisID(id);
    }
}
