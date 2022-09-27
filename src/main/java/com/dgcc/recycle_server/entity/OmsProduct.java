package com.dgcc.recycle_server.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * oms_product
 * @author 
 */
@Data
@Accessors(chain = true)
public class OmsProduct implements Serializable {
    private Integer id;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 现商品价格
     */
    private BigDecimal price;

    /**
     * 原商品价格
     */
    private BigDecimal oldPrice;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 商品轮播图，多个用,分割
     */
    private String swiperImages;

    /**
     * 是否是热门商品 0-否 1-是
     */
    private Integer isHot;

    /**
     * 是否上架 0-下架 1-上架
     */
    private Integer status;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    /**
     * 商品分类ID
     */
    private Integer categoryId;

    /**
     * 商品描述
     */
    private String desc;

    private static final long serialVersionUID = 1L;
}