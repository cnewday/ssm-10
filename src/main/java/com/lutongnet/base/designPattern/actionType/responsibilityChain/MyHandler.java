/**
* File Name : MyHandler.java
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
 * 自定义处理器
 * @author     lvhao
 * @since       | 
 */

public class MyHandler extends AbstractHandler implements ReqHandler
{
    private String name;
    public MyHandler(String name){
        this.name = name;
    }
    
    @Override
    public void processReq()
    {
        // TODO Auto-generated method stub
        System.err.println("请求已被"+name+"处理...");
        if(null != getHandler()){
            getHandler().processReq();
        }
    }

}
