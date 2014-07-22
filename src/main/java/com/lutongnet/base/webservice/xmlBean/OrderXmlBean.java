/**
* File Name : Order.java
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
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.lutongnet.base.customAnnotation.ErrorLog;




/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
@XmlRootElement
@XmlType(name="order",propOrder={"id","userId","prodId","quantity","totalPrice","orderTime","orderStatus"})
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderXmlBean implements Serializable
{
    
    private static final long serialVersionUID = -3576227786274346764L;
    
    private Integer id;
    
    @XmlElement(required = true)
    private Date orderTime;
    
    @XmlElement(required = true)
    private Integer userId;
    
    @XmlElement(defaultValue="0")
    private String totalPrice;
    
    @XmlElement(required = true)
    private Integer prodId;
    
    @XmlElement(defaultValue="1")
    private String quantity;
    
    @XmlElement(defaultValue="unpay")
    private String orderStatus;

    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Date getOrderTime()
    {
        return orderTime;
    }
    
    public void setOrderTime(Date orderTime)
    {
        this.orderTime = orderTime;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getTotalPrice()
    {
        return totalPrice;
    }
    
    @ErrorLog("创建了一个实体")
    public void setTotalPrice(String totalPrice)
    {
        this.totalPrice = totalPrice;
    }

    public Integer getProdId()
    {
        return prodId;
    }

    public void setProdId(Integer prodId)
    {
        this.prodId = prodId;
    }

    public String getQuantity()
    {
        return quantity;
    }

    public void setQuantity(String quantity)
    {
        this.quantity = quantity;
    }

    public String getOrderStatus()
    {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus)
    {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString()
    {
        return "Order [id=" + id + ", orderTime=" + orderTime + ", userId="
                + userId + ", totalPrice=" + totalPrice + ", prodId=" + prodId
                + ", quantity=" + quantity + ", orderStatus=" + orderStatus
                + "]";
    }
}
