/**
* File Name : BicycleAdapter.java
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

package com.lutongnet.base.designPattern.structureType.adapter;

import com.lutongnet.base.designPattern.generateType.factory.genericFactory.Bicycle;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */

public class BicycleAdapter extends Bicycle implements ElectricBicycle
{
    @Override
    public void charge(){
        System.err.println("electricBicycle is charging...");
    }
    
    @Override
    public void run(){
        System.err.println("####wrap####");
        super.run();
        System.err.println("####wrap####");
    }
}
