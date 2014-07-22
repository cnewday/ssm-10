/**
* File Name : TestServiceImpl.java
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

package com.lutongnet.base.webservice.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.lutongnet.base.webservice.service.ITestWebService;
import com.lutongnet.base.webservice.xmlBean.OrderXmlBean;
import com.lutongnet.base.webservice.xmlBean.UserXmlBean;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
@WebService(serviceName="testWebService",endpointInterface="com.lutongnet.base.webservice.service.ITestWebService")
public class TestWebService implements ITestWebService
{

    @Override
    public UserXmlBean handle(int userId)
    {
        // TODO Auto-generated method stub
        System.err.println("请求已被处理");
        UserXmlBean uxb = new UserXmlBean();
        uxb.setContactNum("18665854512");
        uxb.setUserName("lvhao");
        
        List<OrderXmlBean> orderList = new ArrayList<OrderXmlBean>();
        OrderXmlBean oxb =  new OrderXmlBean();
        oxb.setUserId(userId);
        oxb.setOrderTime(new Date());
        oxb.setProdId(1000);
        oxb.setTotalPrice("8888");
        
        orderList.add(oxb);
        uxb.setOrders(orderList);
        
        return uxb;
    }
}
