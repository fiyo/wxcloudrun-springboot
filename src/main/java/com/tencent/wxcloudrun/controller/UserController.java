package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.MakeProductRequest;
import com.tencent.wxcloudrun.dto.ProductRequest;
import com.tencent.wxcloudrun.dto.UserRequest;
import com.tencent.wxcloudrun.model.MakeProduct;
import com.tencent.wxcloudrun.model.Product;
import com.tencent.wxcloudrun.model.QrCode;
import com.tencent.wxcloudrun.model.User;
import com.tencent.wxcloudrun.service.ProductService;
import com.tencent.wxcloudrun.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * product控制器
 */
@RestController

public class UserController {

  final UserService userService;
  final Logger logger;

  public UserController(@Autowired UserService userService) {
    this.userService = userService;
    this.logger = LoggerFactory.getLogger(UserController.class);
  }


  /**
   * 查询用户
   * @param request
   * @return
   */
  @PostMapping(value = "/api/user")
  ApiResponse getUser(@RequestBody UserRequest request) {
    logger.info("/api/user post request",request.getId());

    Optional<User> user = userService.getUser(request.getId());

    return ApiResponse.ok(user);
  }


  /**
   * 用户注册
   * @param request
   * @return
   */
  @PostMapping(value = "/api/register")
  ApiResponse bind(@RequestBody UserRequest request) {
    logger.info("/api/register post request",request.getUserName());
    if(StringUtils.isEmpty(request.getUserName())){
      return ApiResponse.error("用户名不能为空！");
    }else {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        User user = new User();
        user.setUserName(request.getUserName());
        user.setId(request.getId());
        user.setLogined("0");
        userService.register(user);
        return ApiResponse.ok(user);
    }
  }
}