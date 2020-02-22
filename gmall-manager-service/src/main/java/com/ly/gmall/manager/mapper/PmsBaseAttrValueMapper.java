package com.ly.gmall.manager.mapper;

import com.ly.gmall.bean.PmsBaseAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseAttrValueMapper extends Mapper<PmsBaseAttrValue> {

    int deleteByAttrId(String attrId);

    int insertPmsBaseAttrValues(List<PmsBaseAttrValue> list);

    int insertPmsBaseAttrValue(PmsBaseAttrValue pmsBaseAttrValue);


}
