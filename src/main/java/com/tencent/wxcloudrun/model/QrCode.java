package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class QrCode implements Serializable {

  private String qrCode;
  private String barCode;
  private String bindDate;
  private String producer;
}
