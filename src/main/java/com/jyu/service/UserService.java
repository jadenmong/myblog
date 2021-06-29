package com.jyu.service;

import com.jyu.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
