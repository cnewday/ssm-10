/**
* File Name : MemcachedTest.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月10日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.memcached;

import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lutongnet.base.entity.Order;

/**
 * @author     lvhao
 * @since       | 
 */
@Component
public class MemcachedTest
{
    public static void main (String[] args) {
        setDate();
        getDate();
    }
    
    //@Scheduled(fixedRate=5000)
    public static void getDate(){
        Random random = new Random();
        int index = 0;
        for(int i=0;i<10;++i){
            index =  random.nextInt(100);
            Object obj = MemcachedUtil.get("user" + index);
            System.err.println(obj);
        }
    }
    
    public static void setDate(){
        MemcachedUtil.put("helloWorld", "one world one dream", 60);
        String hello = (String) MemcachedUtil.get("helloWorld");
        System.err.println(hello);
        
        for(int i = 0; i < 10; ++i) {
            Order order = new Order();
            order.setId(i);
            order.setOrderStatus("unpay");
            MemcachedUtil.put("user" + i, order, 30*60*1000);
        }
    }
}
