/**
* File Name : TestClient.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月9日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.webservice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lutongnet.base.webservice.service.ITestWebService;

/**
 * 测试类
 * @author     lvhao
 * @since       | 
 */

public class TestClient
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:root-context*.xml");
        ITestWebService client = (ITestWebService)context.getBean("client");
        System.out.println(client.handle(1));
    }
}
