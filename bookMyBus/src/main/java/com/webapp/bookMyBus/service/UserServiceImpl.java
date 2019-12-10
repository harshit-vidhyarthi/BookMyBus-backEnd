package com.webapp.bookMyBus.service;

import com.webapp.bookMyBus.entity.User;
import com.webapp.bookMyBus.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO theuserDAO) {
        userDAO = theuserDAO;
    }

    @Override
    public User findByUserCreds(String username, String password) {
        return userDAO.findByUserCreds(username, password);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }
}
