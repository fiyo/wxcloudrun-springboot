package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.QrCode;

import java.util.Optional;

public interface QrCodeService {

  Optional<QrCode> getQrCode(String qrCode);
}
