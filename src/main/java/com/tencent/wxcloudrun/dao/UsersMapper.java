package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;
import com.tencent.wxcloudrun.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersMapper {

  User getUser(@Param("id") String id);

  int register(User user);
}
