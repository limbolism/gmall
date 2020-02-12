package com.ly.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ly.gmall.bean.PmsBaseCatalog1;
import com.ly.gmall.manager.mapper.CatalogMapper;
import com.ly.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    CatalogMapper catalogMapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalogMapper.getCatalog1();
    }
}
