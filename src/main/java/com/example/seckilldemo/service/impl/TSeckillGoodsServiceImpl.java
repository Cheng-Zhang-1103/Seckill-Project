package com.example.seckilldemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.seckilldemo.entity.TSeckillGoods;
import com.example.seckilldemo.mapper.TSeckillGoodsMapper;
import com.example.seckilldemo.service.ITSeckillGoodsService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Seckill Goods table Service implementation class
 *
 * @author cheng
 */
@Service
@Primary
public class TSeckillGoodsServiceImpl extends ServiceImpl<TSeckillGoodsMapper, TSeckillGoods> implements ITSeckillGoodsService {

}
