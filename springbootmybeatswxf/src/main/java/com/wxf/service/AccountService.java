/**
 * Copyright (C), 2018-2019
 * FileName: AccountService
 * Author:   Administrator
 * Date:     2019/1/15 16:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wxf.service;

import com.wxf.dao.AccountMapper;
import com.wxf.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/15
 * @since 1.0.0
 */
@Service
public class AccountService {

    @Autowired
    protected AccountMapper accountMapper;

    public int add(String name,double money){
        return  accountMapper.add(name,money);
    }

    public int update(String name,double money,int id){
        return  accountMapper.update(name, money, id);
    }

    public int delete(int id){
        return  accountMapper.delete(id);
    }

    public Account findAccount (int id){
        return accountMapper.findAccount(id);
    }

    public List<Account> findAccountList(){
        return  accountMapper.findAccountList();
    }
}