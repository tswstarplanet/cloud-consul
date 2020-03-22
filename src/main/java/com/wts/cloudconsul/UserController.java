package com.wts.cloudconsul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/id")
    public String getId() {
        System.out.println("get id request");
        return "id";
    }
}
