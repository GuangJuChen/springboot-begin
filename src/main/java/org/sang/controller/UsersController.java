package org.sang.controller;

import org.sang.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    Users users;

    @GetMapping("/user")
    public String user(){
        return users.toString();
    }

}
