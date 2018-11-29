package com.wenba.rpc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wenba.api.ArrisServiceFacade;
import com.wenba.common.annotation.Master;
import com.wenba.common.domain.ArrisInfo;
import com.wenba.common.domain.User;
import com.wenba.common.vo.UserVo;
import com.wenba.service.arris.ArrisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}",
        group = "${dubbo.provider.group}"
)

public class ArrisServiceProvider implements ArrisServiceFacade {

    @Autowired
    ArrisService arrisService;


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

    //调用表达式
    @Override
    public int transArrisInfoList(ArrisInfo ai) {
        return 0;
    }
}
