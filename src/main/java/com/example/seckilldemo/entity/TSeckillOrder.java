package com.example.seckilldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * t_seckill_order
 *
 * @author boshen
 */
@TableName("t_seckill_order")
@ApiModel(value = "seckill_order", description = "seckill_order")
public class TSeckillOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /** Seckill Order ID **/
    @ApiModelProperty("Seckill Order ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** User ID **/
    @ApiModelProperty("User ID")
    private Long userId;

    /** Order ID **/
    @ApiModelProperty("Order ID")
    private Long orderId;

    /** Goods ID **/
    @ApiModelProperty("Goods ID")
    private Long goodsId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "TSeckillOrder{" +
        "id=" + id +
        ", userId=" + userId +
        ", orderId=" + orderId +
        ", goodsId=" + goodsId +
        "}";
    }
}
