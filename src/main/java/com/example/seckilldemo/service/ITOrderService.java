package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TOrder;
import com.example.seckilldemo.entity.TUser;
import com.example.seckilldemo.vo.GoodsVo;
import com.example.seckilldemo.vo.OrderDeatilVo;
import org.apache.catalina.User;

/**
 * Services
 *
 * @author boshen
 * @since 2022-03-03
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * Seckill
     *
     * @param user    User objects
     * @param goodsVo Goods objects
     * @return com.example.seckilldemo.entity.TOrder
     * @author boshen
     * @operation add
     * @date 1:44 下午 2022/3/4
     **/
    TOrder secKill(TUser user, GoodsVo goodsVo);

    /**
     * Order Details Method
     *
     * @param orderId
     * @return com.example.seckilldemo.vo.OrderDeatilVo
     * @author boshen
     * @operation add
     * @date 10:21 下午 2022/3/6
     **/
    OrderDeatilVo detail(Long orderId);

    /**
     * Get the seckill address
     *
     * @param user
     * @param goodsId
     * @return java.lang.String
     * @author boshen
     * @operation add
     * @date 2:59 下午 2022/3/9
     **/
    String createPath(TUser user, Long goodsId);

    /**
     * Calibrate seckill address
     *
     * @param user
     * @param goodsId
     * @param path
     * @return boolean
     * @author boshen
     * @operation add
     * @date 2:59 下午 2022/3/9
     **/
    boolean checkPath(TUser user, Long goodsId, String path);

    /**
     * Verify the verification code
     * @author boshen
     * @operation add
     * @date 3:52 下午 2022/3/9
     * @param tuser
     * @param goodsId
     * @param captcha
     * @return boolean
     **/
    boolean checkCaptcha(TUser tuser, Long goodsId, String captcha);
}
