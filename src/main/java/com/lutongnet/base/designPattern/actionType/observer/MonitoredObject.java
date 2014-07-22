/**
* File Name : MonitoredObject.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月19日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.designPattern.actionType.observer;

/**
 * 被观察者对象
 * @author     lvhao
 * @since       | 
 */

public interface MonitoredObject
{
    //添加观察者
    void add(Observer o);
    
    //删除观察者
    void delete(Observer o);
    
    //自身行为
    void operate();
    
    //通知该对象的所有观察者
    void notifyAllObservers();
}
