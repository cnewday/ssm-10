/**
* File Name : FactoryTest.java
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

package com.lutongnet.base.designPattern.generateType.factory.genericFactory;

/**
 * 简单工厂
 * @author     lvhao
 * @since       | 
 */

public class SimpleFactory
{
    public Vehicle getVehicle(String vehicleName){
        Vehicle vehicle = null;
        if("bicycle".equals(vehicleName)){
            vehicle =  new Bicycle();
        }else if("automobile".equals(vehicleName)){
            vehicle =  new Automobile();
        }
        return vehicle;
    }
}
