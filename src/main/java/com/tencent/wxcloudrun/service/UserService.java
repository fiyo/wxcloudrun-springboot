package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.User;

import java.util.Optional;

public interface UserService {

  Optional<User> getUser(String id);

  int register(User user);

}
