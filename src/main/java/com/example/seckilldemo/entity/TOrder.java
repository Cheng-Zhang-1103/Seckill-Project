package com.example.seckilldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 *
 * @author boshen
 */
@TableName("t_order")
@ApiModel(value = "", description = "")
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /** Order ID **/
    @ApiModelProperty("Order ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** User ID **/
    @ApiModelProperty("User ID")
    private Long userId;

    /** Goods ID **/
    @ApiModelProperty("Goods ID")
    private Long goodsId;

    /** Delivery Address ID **/
    @ApiModelProperty("Delivery Address ID")
    private Long deliveryAddrId;

    /** Goods Name **/
    @ApiModelProperty("Goods Name")
    private String goodsName;

    /** Goods Count **/
    @ApiModelProperty("Goods Count")
    private Integer goodsCount;

    /** Goods Price **/
    @ApiModelProperty("Goods Price")
    private BigDecimal goodsPrice;

    /** 1 pc,2 android, 3 ios **/
    @ApiModelProperty("1 pc,2 android, 3 ios")
    private Integer orderChannel;

    /** Order Status, 0 New Unpaid, 1 Paid, 2 Shipped, 3 Received, 4 Returned, 5 Completed **/
    @ApiModelProperty("Order Status, 0 New Unpaid, 1 Paid, 2 Shipped, 3 Received, 4 Returned, 5 Completed")
    private Integer status;

    /** Order creation date **/
    @ApiModelProperty("Order creation date")
    private Date createDate;

    /** Payment time **/
    @ApiModelProperty("Payment time")
    private Date payDate;


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

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getDeliveryAddrId() {
        return deliveryAddrId;
    }

    public void setDeliveryAddrId(Long deliveryAddrId) {
        this.deliveryAddrId = deliveryAddrId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(Integer orderChannel) {
        this.orderChannel = orderChannel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    @Override
    public String toString() {
        return "TOrder{" +
        "id=" + id +
        ", userId=" + userId +
        ", goodsId=" + goodsId +
        ", deliveryAddrId=" + deliveryAddrId +
        ", goodsName=" + goodsName +
        ", goodsCount=" + goodsCount +
        ", goodsPrice=" + goodsPrice +
        ", orderChannel=" + orderChannel +
        ", status=" + status +
        ", createDate=" + createDate +
        ", payDate=" + payDate +
        "}";
    }
}
