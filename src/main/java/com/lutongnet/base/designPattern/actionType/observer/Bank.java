/**
* File Name : Bank.java
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
 * 被观察者-银行
 * @author     lvhao
 * @since       | 
 */

public class Bank extends AbstractMonitorObject
{
    @Override
    public void operate(){
        System.err.println("银行转移资金...");
        this.notifyAllObservers();
    }
}
