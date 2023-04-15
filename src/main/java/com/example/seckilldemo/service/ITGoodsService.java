package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TGoods;
import com.example.seckilldemo.vo.GoodsVo;

import java.util.List;

/**
 * Goods table Service category
 *
 * @author boshen
 * @since 2022-03-03
 */
public interface ITGoodsService extends IService<TGoods> {

    /**
     * Return to goods list
     *
     * @param
     * @return java.util.List<com.example.seckilldemo.vo.GoodsVo>
     * @author boshen
     * @operation add
     * @date 5:49 下午 2022/3/3
     **/
    List<GoodsVo> findGoodsVo();

    /**
     * Get goods details
     *
     * @param goodsId
     * @return java.lang.String
     * @author boshen
     * @operation add
     * @date 9:37 上午 2022/3/4
     **/
    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
