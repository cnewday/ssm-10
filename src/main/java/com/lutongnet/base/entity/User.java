/**
* File Name : User.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年6月25日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.entity;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
public class User implements Serializable
{
    
    private static final long serialVersionUID = 6951009095769057946L;

    private Integer id;
    
    private String userName;
    
    private String contactNum;
    
    /**
     * @return id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id)
    {
        this.id = id;
    }

    /**
     * @return userName
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    /**
     * @return contactNum
     */
    public String getContactNum()
    {
        return contactNum;
    }

    /**
     * @param contactNum
     */
    public void setContactNum(String contactNum)
    {
        this.contactNum = contactNum;
    }

    @Override
    public String toString()
    {
        return "User [id=" + id + ", userName=" + userName + ", contactNum="
                + contactNum + "]";
    }

    
}
