package com.wxf;


import com.wxf.dao.CustomerDao;
import com.wxf.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCustomerDao {
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void  testSaveUser(){
        Customer customer = new Customer();
        customer.setId(21L);
        customer.setFirstName("下啥啥啥");
        customer.setEndName("啊卡卡卡");
        customerDao.saveUser(customer);

    }

    @Test
    public void deleteUser(){
        customerDao.deleteUser(21L);
    }
}
