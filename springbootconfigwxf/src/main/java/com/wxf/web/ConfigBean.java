/**
 * Copyright (C), 2018-2019
 * FileName: ConfigBean
 * Author:   Administrator
 * Date:     2019/1/11 16:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wxf.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/11
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "my")
@Component
public class ConfigBean {



    private String name;
    private int age;
    private  int number;
    private String uuid;
    private  String max;
    private String value;
    private String greeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGreeting() {
        return greeting;
    }
    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }



}