/**
* File Name : BicycleProvider.java
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

package com.lutongnet.base.designPattern.generateType.factory.abstractFactory;

import com.lutongnet.base.designPattern.generateType.factory.genericFactory.Bicycle;
import com.lutongnet.base.designPattern.generateType.factory.genericFactory.Vehicle;
import com.lutongnet.base.designPattern.generateType.factory.genericFactory.Vehicle;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */

public class BicycleProvider implements VehicleProvider
{

    @Override
    public Vehicle getVehicle()
    {
        // TODO Auto-generated method stub
        return new Bicycle();
    }

}
