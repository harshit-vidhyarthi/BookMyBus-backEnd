package com.webapp.bookMyBus.repository;

import com.webapp.bookMyBus.entity.User;

public interface UserDAO {
    public User findByUserCreds(String username, String password);
    public void save(User user);
}
