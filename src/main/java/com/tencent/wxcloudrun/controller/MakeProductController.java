package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.MakeProductRequest;
import com.tencent.wxcloudrun.dto.ProductRequest;
import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;
import com.tencent.wxcloudrun.service.DayMakeProductService;
import com.tencent.wxcloudrun.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * product控制器
 */
@RestController

public class MakeProductController {

  final DayMakeProductService dayMakeProductService;
  final Logger logger;

  public MakeProductController(@Autowired DayMakeProductService dayMakeProductService) {
    this.dayMakeProductService = dayMakeProductService;
    this.logger = LoggerFactory.getLogger(MakeProductController.class);
  }

  /**
   * 产品列表
   * @return API response json
   */
  @PostMapping(value = "/api/makelist")
  ApiResponse getList(@RequestBody ProductRequest request) {
    logger.info("/api/makelist get request");
    List<MakeProduct> list = dayMakeProductService.getList();
    return ApiResponse.ok(list);
  }


  
}