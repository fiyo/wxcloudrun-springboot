package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Grainger
 * @Date: 2023-10-24 16:24
 */
@Data
public class MakeProduct  implements Serializable {
    private String make_Date;
    private String bar_code;
    private String name;
    private String make_count;
    private String make_half_count;
    private String back_count;
    private String remark;
}
