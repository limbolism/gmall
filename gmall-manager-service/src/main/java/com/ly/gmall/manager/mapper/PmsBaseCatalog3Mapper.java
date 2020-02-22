package com.ly.gmall.manager.mapper;

import com.ly.gmall.bean.PmsBaseCatalog3;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PmsBaseCatalog3Mapper {

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
