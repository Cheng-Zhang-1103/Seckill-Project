package com.example.seckilldemo.controller;

import com.example.seckilldemo.entity.TUser;
import com.example.seckilldemo.service.ITOrderService;
import com.example.seckilldemo.vo.GoodsVo;
import com.example.seckilldemo.vo.OrderDeatilVo;
import com.example.seckilldemo.vo.RespBean;
import com.example.seckilldemo.vo.RespBeanEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Front End Controller
 *
 * @author xing
 */
@RestController
@RequestMapping("/order")
@Api(value = "order", tags = "order")
public class TOrderController {

    @Autowired
    private ITOrderService itOrderService;


    @ApiOperation("order")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public RespBean detail(TUser tUser, Long orderId) {
        if (tUser == null) {
            return RespBean.error(RespBeanEnum.SESSION_ERROR);
        }
        OrderDeatilVo orderDeatilVo = itOrderService.detail(orderId);
        return RespBean.success(orderDeatilVo);
    }
}
