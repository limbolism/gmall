package com.ly.gmall.manager.mapper;

import com.ly.gmall.bean.PmsBaseCatalog1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CatalogMapper {
    List<PmsBaseCatalog1> getCatalog1();
}
