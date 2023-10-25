package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;

import java.util.List;
import java.util.Optional;

public interface ProductService {

  List<Product> getList();

  Optional<Product> getProduct(String barCode);

  void bind(QrCode qrCode);

  void saveMakeProduct(MakeProduct makeProduct);

}
