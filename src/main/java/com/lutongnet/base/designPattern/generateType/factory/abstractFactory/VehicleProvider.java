/**
* File Name : VehicleProvider.java
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

import com.lutongnet.base.designPattern.generateType.factory.genericFactory.Vehicle;

/**
 * 服务提供者
 * @author     lvhao
 * @since       | 
 */

public interface VehicleProvider
{
    Vehicle getVehicle();
}
