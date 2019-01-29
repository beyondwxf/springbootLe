package com.wxf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void  setKey(String key,String value){
        stringRedisTemplate.opsForValue().set(key,value,1, TimeUnit.MINUTES);

    }

    public  String getValue(String key){
        return    stringRedisTemplate.opsForValue().get(key);
    }

}
