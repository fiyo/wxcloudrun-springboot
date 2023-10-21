package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.dto.ProductRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.service.CounterService;
import com.tencent.wxcloudrun.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * product控制器
 */
@RestController

public class ProductController {

  final ProductService productService;
  final Logger logger;

  public ProductController(@Autowired ProductService productService) {
    this.productService = productService;
    this.logger = LoggerFactory.getLogger(ProductController.class);
  }


  /**
   * 产品列表
   * @return API response json
   */
  @GetMapping(value = "/api/list")
  ApiResponse get() {
    logger.info("/api/product list get request");
    List<Product> list = productService.getList();
    return ApiResponse.ok(list);
  }

  /**
   * 查询单个产品
   * @param request
   * @return
   */
  @GetMapping(value = "/api/product")
  ApiResponse getProduct(@RequestBody ProductRequest request) {
    logger.info("/api/product get request",request.getBarCode());
    Optional<Product> product = productService.getProduct(request.getBarCode());

    return ApiResponse.ok(product);
  }

  
}