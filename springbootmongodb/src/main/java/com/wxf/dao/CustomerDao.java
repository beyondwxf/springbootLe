package com.wxf.dao;

import com.wxf.entity.Customer;

public interface CustomerDao {
    void saveUser(Customer customer);
    void  deleteUser(Long id);
}
