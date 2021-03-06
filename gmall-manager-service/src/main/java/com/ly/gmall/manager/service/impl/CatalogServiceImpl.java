package com.ly.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ly.gmall.bean.PmsBaseCatalog1;
import com.ly.gmall.bean.PmsBaseCatalog2;
import com.ly.gmall.bean.PmsBaseCatalog3;
import com.ly.gmall.manager.mapper.PmsBaseCatalog1Mapper;
import com.ly.gmall.manager.mapper.PmsBaseCatalog2Mapper;
import com.ly.gmall.manager.mapper.PmsBaseCatalog3Mapper;
import com.ly.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.getCatalog1();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        return pmsBaseCatalog2Mapper.getCatalog2(catalog1Id);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        return pmsBaseCatalog3Mapper.getCatalog3(catalog2Id);
    }
}
