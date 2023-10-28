package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.DayMakeProductsMapper;
import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.service.CounterService;
import com.tencent.wxcloudrun.service.DayMakeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayMakeProductServiceImpl  implements DayMakeProductService {

  final DayMakeProductsMapper dayMakeProductsMapper;

  public DayMakeProductServiceImpl(@Autowired DayMakeProductsMapper dayMakeProductsMapper) {
    this.dayMakeProductsMapper = dayMakeProductsMapper;
  }


  @Override
  public List<MakeProduct> getList() {
    return dayMakeProductsMapper.getList();
  }
}
