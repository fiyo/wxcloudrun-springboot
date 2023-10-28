package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.CountersMapper;
import com.tencent.wxcloudrun.dao.DayMakeProductsMapper;
import com.tencent.wxcloudrun.dao.ProductsMapper;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;
import com.tencent.wxcloudrun.service.CounterService;
import com.tencent.wxcloudrun.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

  final ProductsMapper productsMapper;

  public ProductServiceImpl(@Autowired ProductsMapper productsMapper) {
    this.productsMapper = productsMapper;
  }

  @Override
  public Optional<Product> getProduct(String barCode) {
    return Optional.ofNullable(productsMapper.getProduct(barCode)
    );
  }

  @Override
  public List<Product> getList() {
    return productsMapper.getList();
  }

  @Override
  public void bind(QrCode qrCode) {
    productsMapper.bind(qrCode);
  }

  @Override
  public void saveMakeProduct(MakeProduct makeProduct) {
    productsMapper.saveMakeProduct(makeProduct);
  }
}
