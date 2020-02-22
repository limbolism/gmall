package com.ly.gmall.manager.mapper;

import com.ly.gmall.bean.PmsBaseAttrInfo;
import com.ly.gmall.bean.PmsBaseAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PmsBaseAttrInfoMapper extends Mapper<PmsBaseAttrInfo> {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    int saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    int updateByKey(PmsBaseAttrInfo pmsBaseAttrInfo);
}
