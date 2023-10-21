package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductsMapper {

  Product getProduct(@Param("id") String id);

  List<Product> getList();
}
