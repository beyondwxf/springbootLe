package com.wxf.controller;

import com.wxf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;
    @GetMapping("/transfer")
    public String updateAcount(){
        accountService.transfer();
        return "aaa";

    }
}
