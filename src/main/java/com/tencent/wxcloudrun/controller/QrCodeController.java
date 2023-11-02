package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.MakeProductRequest;
import com.tencent.wxcloudrun.dto.ProductRequest;
import com.tencent.wxcloudrun.dto.QrCodeRequest;
import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;
import com.tencent.wxcloudrun.service.ProductService;
import com.tencent.wxcloudrun.service.QrCodeService;
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
 * qrCode控制器
 */
@RestController

public class QrCodeController {

  final QrCodeService qrCodeService;
  final Logger logger;

  public QrCodeController(@Autowired QrCodeService qrCodeService) {
    this.qrCodeService = qrCodeService;
    this.logger = LoggerFactory.getLogger(QrCodeController.class);
  }


  /**
   * 查询单个
   * @param request
   * @return
   */
  @PostMapping(value = "/api/qrcode")
  ApiResponse getProduct(@RequestBody QrCodeRequest request) {
    logger.info("/api/qrcode post request",request.getQrCode());

    Optional<QrCode> qrCode = qrCodeService.getQrCode(request.getQrCode());

    return ApiResponse.ok(qrCode);
  }
  
}