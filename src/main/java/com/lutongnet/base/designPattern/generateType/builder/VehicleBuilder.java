/**
* File Name : VehicleBuilder.java
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

package com.lutongnet.base.designPattern.generateType.builder;

import java.util.ArrayList;
import java.util.List;

import com.lutongnet.base.designPattern.generateType.factory.genericFactory.Automobile;
import com.lutongnet.base.designPattern.generateType.factory.genericFactory.Bicycle;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */

public class VehicleBuilder
{
    
    public List<Bicycle> produceBicycle(int n){
        System.err.println("生产了"+n+"辆自行车...");
        List<Bicycle>  bicycleList = new ArrayList<Bicycle>();
        while (n>0){
            bicycleList.add(new Bicycle());
            --n;
        }
        return bicycleList;
    }
    
    public List<Automobile> produceAutomobile(int n){
        System.err.println("生产了"+n+"汽车...");
        List<Automobile> automobileList = new ArrayList<Automobile>();
        while (n>0){
            automobileList.add(new Automobile());
            --n;
        }
        return automobileList;
    }
}
