/**
* File Name : AopService.java
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

import org.springframework.stereotype.Service;

import com.lutongnet.base.customAnnotation.ErrorLog;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
@Service
public class AopService
{
    @ErrorLog(value="创建一条记录",desc="测试使用",debug=true)
    public String add(String a,String b){
        System.err.println("do something.");
        return a+b;
    }
}
