package com.example.seckilldemo.vo;

import com.example.seckilldemo.entity.TUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Goods details return object
 *
 * @author: LC
 * @ClassName: DetailVo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailVo {


    private TUser tUser;

    private GoodsVo goodsVo;

    private int secKillStatus;

    private int remainSeconds;


}
