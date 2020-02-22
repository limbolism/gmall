package com.ly.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ly.gmall.bean.PmsBaseAttrInfo;
import com.ly.gmall.bean.PmsBaseAttrValue;
import com.ly.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    AttrService attrService;


    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(@RequestParam(name = "attrId",required = true) String attrId){
        return attrService.getAttrValueList(attrId);
    }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        return attrService.saveAttrInfo(pmsBaseAttrInfo);
    }

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(@RequestParam(name = "catalog3Id",required = true) String catalog3Id){
        return attrService.attrInfoList(catalog3Id);
    }
}
