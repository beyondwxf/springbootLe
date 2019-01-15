/**
 * Copyright (C), 2018-2019
 * FileName: LucyContorller
 * Author:   Administrator
 * Date:     2019/1/11 16:26
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
@EnableConfigurationProperties({ConfigBean.class})
public class LucyContorller {
    @Autowired
    private ConfigBean configBean;


    @RequestMapping("/lucy")
    public String getlucy() {

        return configBean.getName() + "==>" + configBean.getUuid() + "==>" + configBean.getAge() + "==>" + configBean.getNumber() + "==>" + configBean.getAge();
    }

}