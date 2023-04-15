package com.example.seckilldemo.vo;

import com.example.seckilldemo.entity.TOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Order details return object
 *
 * @author: LC
 * @ClassName: OrderDeatilVo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDeatilVo {

    private TOrder tOrder;

    private GoodsVo goodsVo;
}
