package com.groupone.gohr.service;

import com.groupone.gohr.entity.User;

/**
 * className:UserService
 * discriptoin:
 * author:朱得鑫
 * createTime:2018-11-15 11:08
 */
public interface UserService {
  public User findByUsername(String userName);
}
