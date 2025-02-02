package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Product implements Serializable {
  private String barCode;
  private String name;
  private String psn;
  private String makeCount;
  private String makeHalfCount;
  private String backCount;
  private String remark;
  private String makeDate;
}
