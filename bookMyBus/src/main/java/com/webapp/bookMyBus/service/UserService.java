package com.webapp.bookMyBus.service;

import com.webapp.bookMyBus.entity.User;

public interface UserService {
    public User findByUserCreds(String username, String password);
    public void save(User user);
}
