package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.MakeProduct;

import java.util.List;

public interface DayMakeProductService {

  /**
   * 返回最新盘点列表
   * @return
   */
  List<MakeProduct> getMakeList();


}
