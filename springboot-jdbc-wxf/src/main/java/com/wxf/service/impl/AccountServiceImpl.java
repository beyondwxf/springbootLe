package com.wxf.service.impl;

import com.wxf.dao.IAccountDao;
import com.wxf.entity.Account;
import com.wxf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private IAccountDao iAccountDao;

    @Override
    public int add(Account account) {

        return iAccountDao.add(account);
    }

    @Override
    public int update(Account account) {
        return iAccountDao.update(account);
    }

    @Override
    public int delete(int id) {
        return iAccountDao.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return iAccountDao.findAccountById(id);

    }

    @Override
    public List<Account> findAccountList() {
        return iAccountDao.findAccountList();
    }
}
