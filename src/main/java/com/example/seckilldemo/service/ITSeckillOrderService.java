package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TSeckillOrder;
import com.example.seckilldemo.entity.TUser;

/**
 * Seckill order form Service category
 *
 * @author boshen
 * @since 2022-03-03
 */
public interface ITSeckillOrderService extends IService<TSeckillOrder> {

    /**
     * Get seckill results
     *
     * @param tUser
     * @param goodsId
     * @return orderId success; -1 spike failure; 0 in queue
     * @author boshen
     * @operation add
     * @date 7:07 下午 2022/3/8
     **/
    Long getResult(TUser tUser, Long goodsId);
}
