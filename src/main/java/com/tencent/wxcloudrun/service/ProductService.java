package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;

import java.util.List;
import java.util.Optional;

public interface ProductService {

  List<Product> getList();

  Optional<Product> getProduct(String id);

  void bind(QrCode qrCode);

}
