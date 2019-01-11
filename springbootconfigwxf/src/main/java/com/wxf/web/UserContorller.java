/**
 * Copyright (C), 2018-2019
 * FileName: UserContorller
 * Author:   Administrator
 * Date:     2019/1/11 16:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wxf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/11
 * @since 1.0.0
 */
@RestController
@EnableConfigurationProperties({User.class})
public class UserContorller {
    @Autowired
    private  User user;

    @RequestMapping(value = "/user")
    public String user(){

        return user.getName()+"------->"+user.getAge();
    }

}