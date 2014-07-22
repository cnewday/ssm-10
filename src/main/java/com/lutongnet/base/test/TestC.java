/**
* File Name : TestC.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014�?�?5�?          lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.test;

import java.util.Calendar;

import javax.annotation.Resource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.lutongnet.base.entity.Order;
import com.lutongnet.base.mapper.OrderMapper;

/**
 * @author     lvhao
 * @since       | 
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestC extends TestBase<Order>
{
    @Resource(name="orderMapper")
    private OrderMapper orderMapper;
    
    private static Order order;
    
    @Override
    public Integer doNothing(){return 1;}
    
    @BeforeClass
    public static void initOrder(){
        order = new Order();
        order.setOrderTime(Calendar.getInstance().getTime());
        order.setProdId(1);
        order.setUserId(1000);
        order.setQuantity("10");
        order.setTotalPrice("1000");
        order.setOrderStatus("unpay");
    }
    
    @Test
    public void test2(){
        //order = orderMapper.select(1);
        //printMsg(order.toString());
    }
    
    /*@Test
    public void test1(){
        orderMapper.insert(order);
    }
    
    @Test
    public void test3(){
        order.setUserId(2000);
        orderMapper.update(order);
        order=orderMapper.select(1);
        printMsg(order.toString());
    }
    
    @Test
    public void test4(){
        orderMapper.delete(1);
    }*/
}
