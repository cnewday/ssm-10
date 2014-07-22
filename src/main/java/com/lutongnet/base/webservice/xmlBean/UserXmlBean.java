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

package com.lutongnet.base.webservice.xmlBean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class UserXmlBean implements Serializable
{
    private static final long serialVersionUID = -1196676247585756241L;

    private Integer id;
    
    private String userName;
    
    private String contactNum;
    
    private List<OrderXmlBean> orders;
    
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

    public List<OrderXmlBean> getOrders()
    {
        return orders;
    }

    public void setOrders(List<OrderXmlBean> orders)
    {
        this.orders = orders;
    }

    @Override
    public String toString()
    {
        return "UserXmlBean [id=" + id + ", userName=" + userName
                + ", contactNum=" + contactNum + ", orders=" + orders + "]";
    }

}
