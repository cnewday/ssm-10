/**
* File Name : TestServer.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月8日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.webservice.server;

import javax.xml.ws.Endpoint;

import com.lutongnet.base.webservice.service.ITestWebService;
import com.lutongnet.base.webservice.serviceImpl.TestWebService;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */

public class TestServer
{
    public static void main(String[] args) {
        ITestWebService implementor= new TestWebService();
        String address="http://localhost:8080/webservice/testService";
        Endpoint.publish(address, implementor);
        System.out.println("web service started...");
    }
}

