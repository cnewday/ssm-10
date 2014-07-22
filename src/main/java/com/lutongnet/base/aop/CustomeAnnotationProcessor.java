/**
* File Name : CustomeAnnotationProcessor.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月5日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.lutongnet.base.customAnnotation.ErrorLog;

/**
 * 解析自定义注解
 * @author     lvhao
 * @since       | 7
 */
@Component
@Aspect
public class CustomeAnnotationProcessor
{
    //注解？ 修饰符? 返回值类型 类型声明?方法名(参数列表) 异常列表
    //@Pointcut(value="execution(* *(..))")
    @Pointcut("@annotation(com.lutongnet.base.customAnnotation.ErrorLog)")
    private void errorLogAnnotationProcessor(){}
    
    /*@Before("errorLogAnnotationProcessor()")
    public void doBefore(JoinPoint jp){
        Signature signature = jp.getSignature();  
        MethodSignature methodSignature = (MethodSignature) signature;  
        Method method = methodSignature.getMethod();
        ErrorLog errorLog = method.getAnnotation(ErrorLog.class);
        System.err.println("##beforeMethod##");
        System.err.println("annotation==>"+errorLog.annotationType());
        System.err.println("annotation-desc==>"+errorLog.desc());
        System.err.println("annotation-value==>"+errorLog.value());
        System.err.println("method==>"+method.getName());
        Object[] args = jp.getArgs();
        for(Object o : args){
            System.err.println("args==>"+o);
        }
        System.err.println("target==>"+jp.getSignature().getDeclaringTypeName());
    }
    
    @After("errorLogAnnotationProcessor()")
    public void doAfter(){
        System.err.println("##afterMethod##");
    }
   
    @AfterReturning("errorLogAnnotationProcessor()")
    public void doAfterReturn(){
        System.err.println("##afterReturn##");
    }*/
    
    @Around("errorLogAnnotationProcessor()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
        System.err.println("##around##");
        Signature signature = pjp.getSignature();  
        MethodSignature methodSignature = (MethodSignature) signature;  
        Method method = methodSignature.getMethod();
        ErrorLog errorLog = method.getAnnotation(ErrorLog.class);
        boolean debug = errorLog.debug();
        Object result = null;
        
        //所有参数
        Object[] args =  pjp.getArgs();
        for(Object o : args){
            System.err.println("args==>"+o);
        }
        
        //测试环境
        if(debug){
            System.err.println("-当前为【测试】环境-");
            args[0] = "lucy";
            args[1] = "li";
            result = pjp.proceed(args);
        }else{
            System.err.println("-当前为【正式】环境-");
            result = pjp.proceed();
        }
        System.err.println(errorLog.value());
        System.err.println(errorLog.desc());
        
        return result;
    }
}
