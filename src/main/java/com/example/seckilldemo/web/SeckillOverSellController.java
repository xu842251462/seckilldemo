package com.example.seckilldemo.web;

import com.example.seckilldemo.services.SeckillOverSellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SeckillOverSellController {
    @Autowired
    private SeckillOverSellService seckillOverSellService;
    /**
     * 简单 处理抢购请求
     * @param seckillActivityId
     * @return
     */
    @ResponseBody
    @RequestMapping("/seckill/{seckillActivityId}")
    public String seckil(@PathVariable long seckillActivityId){
        return seckillOverSellService.processSeckill(seckillActivityId);
    }

}
