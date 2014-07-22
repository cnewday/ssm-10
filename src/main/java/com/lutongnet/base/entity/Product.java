/**
* File Name : Product.java
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
public class Product implements Serializable
{
    private static final long serialVersionUID = -7035880759441812955L;
    private Integer id;
    
    private String prodName;

    private String prodPrice;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getProdName()
    {
        return prodName;
    }

    public void setProdName(String prodName)
    {
        this.prodName = prodName;
    }

    public String getProdPrice()
    {
        return prodPrice;
    }

    public void setProdPrice(String prodPrice)
    {
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString()
    {
        return "Product [id=" + id + ", prodName=" + prodName + ", prodPrice="
                + prodPrice + "]";
    }
    
}
