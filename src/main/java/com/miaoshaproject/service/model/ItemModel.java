package com.miaoshaproject.service.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description :
 * @Author : LiuXinyu
 * @Date: 2020-05-27 14:02
 */
@Data
public class ItemModel implements Serializable {
    private static final long serialVersionUID = 5255300026516476343L;
    private Integer id;

    @NotBlank(message = "商品名称不能为空")
    private String title;

    @NotNull(message = "商品价格不能为空")
    @Min(value = 0,message = "商品价格必须大于0")
    private BigDecimal price;

    @NotNull(message = "库存不能为空")
    private Integer stock;

    @NotBlank(message = "商品描述信息不能为空")
    private String description;

    private Integer sales;

    @NotBlank(message = "商品图片不能为空")
    private String imgUrl;

    //使用聚合模型,如果promoModel不为空，则表示其拥有还未结束的秒杀活动
    private PromoModel promoModel;
}
