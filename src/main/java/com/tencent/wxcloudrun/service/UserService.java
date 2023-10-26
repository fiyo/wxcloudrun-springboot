package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;
import com.tencent.wxcloudrun.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

  Optional<User> getUser(String id);

  int register(User user);

}
