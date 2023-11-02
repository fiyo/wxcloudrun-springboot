package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.QrCode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface QrCodeMapper {

  QrCode getQrCode(@Param("qrCode") String qrCode);


}
