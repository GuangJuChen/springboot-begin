package org.sang.controller;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.sang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    User user;

    @GetMapping("/my")
    public String my(){
        return user.toString();
    }
}
