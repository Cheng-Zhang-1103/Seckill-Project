package com.example.seckilldemo.vo;

import com.example.seckilldemo.entity.TGoods;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Goods return object
 *
 * @author: LC
 * @ClassName: GoodsVo
 */
@ApiModel("Goods return object")
public class GoodsVo extends TGoods {

    /**
     * seckil lPrice
     **/
    @ApiModelProperty("Seckill Price")
    private BigDecimal seckillPrice;

    /**
     * stockCount
     **/
    @ApiModelProperty("Stock Count")
    private Integer stockCount;

    /**
     * startDate
     **/
    @ApiModelProperty("Start Date")
    private Date startDate;

    /**
     * endDate
     **/
    @ApiModelProperty("End Date")
    private Date endDate;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
