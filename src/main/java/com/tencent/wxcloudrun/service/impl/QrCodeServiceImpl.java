package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.ProductsMapper;
import com.tencent.wxcloudrun.dao.QrCodeMapper;
import com.tencent.wxcloudrun.model.QrCode;
import com.tencent.wxcloudrun.service.QrCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QrCodeServiceImpl implements QrCodeService {

  final QrCodeMapper qrcodeMapper;

  public QrCodeServiceImpl(@Autowired QrCodeMapper qrcodeMapper) {
    this.qrcodeMapper = qrcodeMapper;
  }

  @Override
  public Optional<QrCode> getQrCode(String qrCode) {
    return Optional.ofNullable(qrcodeMapper.getQrCode(qrCode)
    );
  }
}
