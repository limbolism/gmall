package com.ly.gmall.manager.mapper;

import com.ly.gmall.bean.PmsBaseCatalog2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PmsBaseCatalog2Mapper {
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);
}
