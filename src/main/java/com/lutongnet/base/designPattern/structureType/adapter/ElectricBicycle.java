/**
* File Name : MyBicycle.java
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


/**
 * 电动自行车
 * @author     lvhao
 * @since       | 
 */

//此处没有直接继承 Vehicle接口的原因是 Vehicle可能有当前类不是用的方法
public interface ElectricBicycle
{
    //除了有交通工具的run方法外，还有充电的方法
    void run();
    void charge();
}
