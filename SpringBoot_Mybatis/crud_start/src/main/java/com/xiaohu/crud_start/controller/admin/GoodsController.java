package com.xiaohu.crud_start.controller.admin;

import com.xiaohu.crud_start.entity.Goods;
import com.xiaohu.crud_start.entity.PageBean;
import com.xiaohu.crud_start.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/findByConPage")
    public PageBean findByConPage(Goods goods,
                                  @RequestParam(value = "pageCode",required = false) int pageCode,
                                  @RequestParam(value = "pageSize",required = false) int pageSize){
        return goodsService.findByPage(goods,pageCode,pageSize);
    }

}
