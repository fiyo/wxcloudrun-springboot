package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Grainger
 * @Date: 2023-10-24 16:24
 */
@Data
public class MakeProduct  implements Serializable {
    private String makeDate;
    private String barCode;
    private String name;
    private String makeCount;
    private String makeHalfCount;
    private String backCount;
    private String remark;
}
