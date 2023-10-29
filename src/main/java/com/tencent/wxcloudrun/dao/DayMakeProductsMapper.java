package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DayMakeProductsMapper {

  /**
   * 返回最新盘点列表
   * @return
   */
  List<MakeProduct> getMakeList();

}
