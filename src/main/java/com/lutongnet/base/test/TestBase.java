/**
* File Name : TestBase.java
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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author     lvhao
 * @since        |
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration ( locations = "/root-context.xml" )
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
@Transactional
public class TestBase<T>
{
    @Test
    public Object doNothing(){return new Object();}
    
    //运行时对象类型
    private Class<?> clazz;
    
    //方法的重载
    public void remove(String id){}
    public void remove(int id){}
    //public void remove(List<String> list){}
    //public void remove(List<Integer> list){}
    
    public TestBase(){
        
        //运行时对象类型
        Class<?> tmpClazz = this.getClass();
        System.err.println("class==>"+tmpClazz.getClass().getName());
        
        //当前实体的父类
        System.err.println("superClass==>"+tmpClazz.getSuperclass());
        
        //当前实体的父类(包含泛型信息)
        Type type = tmpClazz.getGenericSuperclass();
        System.err.println("genericSupperClass==>"+type);
        
        if (type instanceof ParameterizedType) {
            Type[] p = ((ParameterizedType) type).getActualTypeArguments();
            this.clazz = (Class<T>) p[0];
            System.err.println("p[0]==>"+p[0]);
            System.err.println("(Class<T>) p[0]==>"+clazz);
            System.err.println("canoicName==>"+clazz.getCanonicalName());
        }
        else{
            System.err.println("非参数化类型...");
        }
    }
    public void printMsg(String msg){
        System.err.println(msg);
    }
    
   /* public <T1> T get(T1 id){
        
    }
    
    public List<T> getList(){
        
    }*/
}   
