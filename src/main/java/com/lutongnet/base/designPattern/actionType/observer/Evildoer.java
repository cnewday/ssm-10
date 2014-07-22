/**
* File Name : Evildoer.java
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
 * 观察者-坏人
 * @author     lvhao
 * @since       | 
 */

public class Evildoer implements Observer
{

    @Override
    public void update()
    {
        // TODO Auto-generated method stub
        System.err.println("坏人收到消息...");
    }

}
