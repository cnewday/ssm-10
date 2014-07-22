/**
* File Name : ErrorAnnotation.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月4日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.customAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 〈一句话功能简述〉
 * @author     lvhao
 * @since       | 
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
public @interface ErrorLog
{
    String value() default "";
    String desc() default "";
    boolean debug() default true;
}
