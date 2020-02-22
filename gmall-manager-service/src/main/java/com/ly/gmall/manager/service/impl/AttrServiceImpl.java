package com.ly.gmall.manager.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.ly.gmall.bean.PmsBaseAttrInfo;
import com.ly.gmall.bean.PmsBaseAttrValue;
import com.ly.gmall.manager.mapper.PmsBaseAttrInfoMapper;
import com.ly.gmall.manager.mapper.PmsBaseAttrValueMapper;
import com.ly.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        return pmsBaseAttrInfoMapper.attrInfoList(catalog3Id);
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        String attrId = pmsBaseAttrInfo.getId();


        List<PmsBaseAttrValue> pmsBaseAttrValues = pmsBaseAttrInfo.getAttrValueList();

        if (StringUtils.isBlank(attrId)) {
            pmsBaseAttrInfoMapper.insertSelective(pmsBaseAttrInfo);
            pmsBaseAttrValues.forEach(pmsBaseAttrValue -> {
                pmsBaseAttrValue.setAttrId(attrId);
                pmsBaseAttrValueMapper.insertSelective(pmsBaseAttrValue);
            });

        } else {
            pmsBaseAttrInfoMapper.updateByKey(pmsBaseAttrInfo);
            pmsBaseAttrValueMapper.deleteByAttrId(attrId);
            pmsBaseAttrValues.forEach(pmsBaseAttrValue -> {
                pmsBaseAttrValue.setAttrId(attrId);
                pmsBaseAttrValueMapper.insertPmsBaseAttrValue(pmsBaseAttrValue);
            });
        }
        return "success";
    }


    @Override
    public List<PmsBaseAttrValue> getAttrValueList(String attrId) {
        return pmsBaseAttrInfoMapper.getAttrValueList(attrId);
    }
}
