package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
  private String id;
  private String userName;
  private String logined;
  private String createDate;
}
