package com.example.seckilldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Goods table
 *
 * @author boshen
 */
@TableName("t_goods")
@ApiModel(value = "goods", description = "goods")
public class TGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /** Goods ID **/
    @ApiModelProperty("Goods ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** Goods Name **/
    @ApiModelProperty("Goods Name")
    private String goodsName;

    /** Goods Title **/
    @ApiModelProperty("Goods Title")
    private String goodsTitle;

    /** Goods Image **/
    @ApiModelProperty("Goods Image")
    private String goodsImg;

    /** Goods Deatil **/
    @ApiModelProperty("Goods Deatil")
    private String goodsDetail;

    /** Goods Price **/
    @ApiModelProperty("Goods Price")
    private BigDecimal goodsPrice;

    /** Goods inventory, -1 means no limit **/
    @ApiModelProperty("Goods inventory, -1 means no limit")
    private Integer goodsStock;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    @Override
    public String toString() {
        return "TGoods{" +
        "id=" + id +
        ", goodsName=" + goodsName +
        ", goodsTitle=" + goodsTitle +
        ", goodsImg=" + goodsImg +
        ", goodsDetail=" + goodsDetail +
        ", goodsPrice=" + goodsPrice +
        ", goodsStock=" + goodsStock +
        "}";
    }
}
