/**
* File Name : SingletonPool.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月18日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.designPattern.generateType.singleton;

/**
 * 单例模式
 * @author     lvhao
 * @since       | 
 */

public class SingletonPool
{
    //私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 
    private static SingletonPool singletonPool = null;
    
    //构造函数私有，防止被new创建
    private SingletonPool(){
    }
    
    //锁机制，多线程使用
    private static synchronized void init(){
        if(null == singletonPool){
            singletonPool = new SingletonPool(); 
        }
    }
    
    //暴漏方法给其他方法调用
    public static SingletonPool getInstance(){
        if(null == singletonPool){
            init();
        }
        return singletonPool;
    }
}
