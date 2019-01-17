package com.wxf.dao;

import com.wxf.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
private MongoTemplate mongoTemplate;
    @Override
    public void saveUser(Customer customer) {
        mongoTemplate.save(customer);
    }

    @Override
    public void deleteUser(Long id) {
//        Query query = new Query(C);
        Query query = new  Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,Customer.class);

    }
}
