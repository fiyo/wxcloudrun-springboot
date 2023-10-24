package com.tencent.wxcloudrun.dto;

import lombok.Data;

@Data
public class ProductRequest {

  private String barCode;
  private String qrCode;
  private String bindDate;
  private String producer;


}
