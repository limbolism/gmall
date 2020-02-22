package com.ly.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ly.gmall.bean.PmsBaseCatalog1;
import com.ly.gmall.bean.PmsBaseCatalog2;
import com.ly.gmall.bean.PmsBaseCatalog3;
import com.ly.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> catalog1 = catalogService.getCatalog1();
        return catalog1;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(@RequestParam(name = "catalog1Id", required = true) String catalog1Id) {

        return catalogService.getCatalog2(catalog1Id);
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(@RequestParam(name = "catalog2Id", required = true) String catalog2Id) {

        return catalogService.getCatalog3(catalog2Id);
    }
}
