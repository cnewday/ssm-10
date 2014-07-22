/**
* File Name : AbstractMonitorObject.java
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

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的被观察对象
 * @author     lvhao
 * @since       | 
 */

public abstract class AbstractMonitorObject implements MonitoredObject
{
    private List<Observer> list = new ArrayList<Observer>();
    
    @Override
    public void add(Observer o)
    {
        // TODO Auto-generated method stub
        System.err.println("添加了一个观察者...");
        list.add(o);
    }

    @Override
    public void delete(Observer o)
    {
        // TODO Auto-generated method stub
        System.err.println("删除了一个观察者...");
        list.remove(o);
    }

    @Override
    public void operate(){}

    @Override
    public void notifyAllObservers()
    {
        // TODO Auto-generated method stub
        for(Observer o : list){
            o.update();
        }

    }
}
