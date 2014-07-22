/**
* File Name : TestWebService.java
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

package com.lutongnet.base.webservice.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.lutongnet.base.webservice.xmlBean.UserXmlBean;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
@WebService
public interface ITestWebService
{
    //处理client请求
    @WebResult(name="userOrders") UserXmlBean handle(@WebParam(name="userId") int userId);
}
