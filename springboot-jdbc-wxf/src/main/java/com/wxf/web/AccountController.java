package com.wxf.web;

import com.wxf.entity.Account;
import com.wxf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Account> getAccounts(){
        return  accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getAccountById(@PathVariable("id") int id){
        return accountService.findAccountById(id).toString();
    }

    @RequestMapping(value = "id",method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id,@RequestParam(value = "name",required = true)String name,@RequestParam(value = "money",required = true)double money){
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        int i = accountService.update(account);
        if (i==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String postAccount( @RequestParam(value = "name")String name,
                                @RequestParam(value = "money" )double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        int t= accountService.add(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }

    }

}
