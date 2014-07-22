/**
* File Name : AbstractHandler.java
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

package com.lutongnet.base.designPattern.actionType.responsibilityChain;

/**
 * 抽象处理器
 * @author     lvhao
 * @since       | 
 */

public class AbstractHandler
{
    private ReqHandler handler;

    public ReqHandler getHandler()
    {
        return handler;
    }

    public void setHandler(ReqHandler handler)
    {
        this.handler = handler;
    }
}
