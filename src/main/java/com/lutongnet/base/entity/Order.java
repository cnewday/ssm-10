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

package com.lutongnet.base.entity;

import java.io.Serializable;
import java.util.Date;




/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
public class Order implements Serializable
{
    
    private static final long serialVersionUID = 7138199661011226673L;

    private Integer id;
    
    private Date orderTime;

    private Integer userId;
    
    private String totalPrice;
    
    private Integer prodId;
    
    private String quantity;
    
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
