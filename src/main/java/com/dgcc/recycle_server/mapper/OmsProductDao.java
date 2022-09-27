package com.dgcc.recycle_server.mapper;

import com.dgcc.recycle_server.entity.OmsProduct;

public interface OmsProductDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OmsProduct record);

    int insertSelective(OmsProduct record);

    OmsProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OmsProduct record);

    int updateByPrimaryKey(OmsProduct record);

    OmsProduct selectByProductName(String productName);
}