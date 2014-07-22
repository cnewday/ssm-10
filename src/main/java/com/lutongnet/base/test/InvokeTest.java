/**
* File Name : InvokeTest.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月7日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.test;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lutongnet.base.customAnnotation.ErrorLog;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
@Controller
@RequestMapping("/aop")
public class InvokeTest
{
    @Resource
    private AopService aopService;
    
    @RequestMapping("/create")
    @ResponseBody
    @ErrorLog(value="进入action",desc="测试使用",debug=false)
    public String create(HttpServletResponse resp){
        System.err.println("----create----");
        String test = aopService.add("lv","hao");
        return "<font size=22 color=black>create a log success...hello,"+test+"</font>";
    }
    
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(HttpServletResponse resp){
        System.err.println("----delete----");
        return "<font size=22 color=red>delete a log success...</font>";
    }

    @RequestMapping("/retrieve")
    @ResponseBody
    public String retrieve(HttpServletResponse resp){
        System.err.println("----retrieve----");
        return "<font size=22 color=green>retrieve a log success...</font>";
    }
    
    @RequestMapping("/update")
    @ResponseBody
    public String update(HttpServletResponse resp){
        System.err.println("----update----");
        return "<font size=22 color=yellow>update a log success...</font>";
    }
}
