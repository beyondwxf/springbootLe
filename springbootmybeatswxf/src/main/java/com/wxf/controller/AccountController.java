/**
 * Copyright (C), 2018-2019
 * FileName: AccountController
 * Author:   Administrator
 * Date:     2019/1/15 16:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wxf.controller;

import com.wxf.entity.Account;
import com.wxf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/15
 * @since 1.0.0
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public   List<Account> getAccounts(){
        return accountService.findAccountList();
    }
}