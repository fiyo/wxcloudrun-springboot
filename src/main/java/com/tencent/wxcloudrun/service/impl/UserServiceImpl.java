package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.ProductsMapper;
import com.tencent.wxcloudrun.dao.UsersMapper;
import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;
import com.tencent.wxcloudrun.model.User;
import com.tencent.wxcloudrun.service.ProductService;
import com.tencent.wxcloudrun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

  final UsersMapper usersMapper;

  public UserServiceImpl(@Autowired UsersMapper usersMapper) {
    this.usersMapper = usersMapper;
  }

  @Override
  public Optional<User> getUser(String id) {
    return Optional.ofNullable(usersMapper.getUser(id));
  }

  @Override
  public int register(User user) {
    return usersMapper.register(user);
  }

}
