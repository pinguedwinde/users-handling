package org.sliga.usersmanagement.controller;

import org.sliga.usersmanagement.exception.ExceptionHandling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = {"/","/user"})
public class UserController extends ExceptionHandling {

    @GetMapping("/hello")
    public String helloUser() {
        return "Hello User";
    }
}
