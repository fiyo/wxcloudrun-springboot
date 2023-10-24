package com.tencent.wxcloudrun.dto;

import lombok.Data;
/**
 * @Author: Grainger
 * @Date: 2023-10-24 16:20
 */
@Data
public class MakeProductRequest {
    private String makeDate;
    private String barCode;
    private String name;
    private String makeCount;
    private String makeHalfCount;
    private String backCount;
    private String remark;
}
