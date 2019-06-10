package com.ericsson.rv.services.issuereporter.issuereporter.controller;

import com.ericsson.rv.services.issuereporter.issuereporter.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ApiController {


    @PostMapping("/api/getUserName")
    public User getUserName(Principal principal) {
        User user = new User();
        user.setUserName(principal.getName());
        return user;
    }

}
