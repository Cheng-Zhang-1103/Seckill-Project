package com.example.seckilldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * seckillgoods
 *
 * @author boshen
 */
@TableName("t_seckill_goods")
@ApiModel(value = "seckill_goods", description = "seckill_goods")
public class TSeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /** Seckill Goods ID **/
    @ApiModelProperty("Seckill Goods ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** Goods ID **/
    @ApiModelProperty("Goods ID")
    private Long goodsId;

    /** Seckill Price **/
    @ApiModelProperty("Seckill Price")
    private BigDecimal seckillPrice;

    /** Stock Count **/
    @ApiModelProperty("Stock Count")
    private Integer stockCount;

    /** Seckill Start Date **/
    @ApiModelProperty("Seckill Start Date")
    private LocalDateTime startDate;

    /** Seckill End Date **/
    @ApiModelProperty("Seckill End Date")
    private LocalDateTime endDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public BigDecimal getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "TSeckillGoods{" +
        "id=" + id +
        ", goodsId=" + goodsId +
        ", seckillPrice=" + seckillPrice +
        ", stockCount=" + stockCount +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        "}";
    }
}
