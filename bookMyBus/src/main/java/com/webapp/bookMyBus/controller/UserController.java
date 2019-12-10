package com.webapp.bookMyBus.controller;

import com.webapp.bookMyBus.entity.User;
import com.webapp.bookMyBus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService theUserService) {
        userService = theUserService;
    }

    @PostMapping("/signup")
    public User addUser(@RequestBody User theUser) {
        userService.save(theUser);
        return theUser;
    }

    @PostMapping("/login")
    public User verifyUser(@RequestParam String username, @RequestParam String password) {
        User user = userService.findByUserCreds(username, password);
        if (user == null) {
            throw new RuntimeException("User not found - " + username);
        }
        return user;
    }

    @GetMapping("logout")
    public void logoutUser() {

    }
}
