package com.ly.gmall.service;

import com.ly.gmall.bean.PmsBaseAttrInfo;
import com.ly.gmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);
}
