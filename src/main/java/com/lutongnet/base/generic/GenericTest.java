/**
 * File Name : GenericTest.java
 * Functions:
 * TODO
 *
 * History:
 *  Date          Modified_By
 * 2014年7月8日           lvhao          
 *
 *  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
 *
 */

package com.lutongnet.base.generic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

/**
 *泛型实例
 * @author lvhao
 * @since |
 */

public class GenericTest
{
    //类型安全说明
    //oList 添加数值类型
    public static List<Object> oList;
    public static List<String> strList;
    public static List<Integer> intList;

    //数组是协变的
    public static Object[] oArray = {"a","b",1};
    public static Integer[] iArray = {1,2,3};
    
    //泛型的作用过程
    public static ArrayList<String> arrayList1=new ArrayList();  
    public static ArrayList arrayList2=new ArrayList<String>();  
    
    private static String strParam = "this is a test";
    private static int intParam = 0;
    
    //泛型通配符
    public static List<Number> nList = new ArrayList<Number>();
    
    //上界 
    public static List<? extends Number> nList1 = new ArrayList<Number>();
    
    //下界
    public static List<? super Number> nList2 = new ArrayList<Number>();
    
    static
    {
        arrayList1.add("1");
        
        //arrayList1.add(1);
        arrayList2.add("1");
        arrayList2.add(1);
        
        oList = new ArrayList<Object>();
        strList = new ArrayList<String>();
        intList = new ArrayList<Integer>();

        //类型安全说明
        oList.add(1);
        oList.add(1.02f);
        //oList.add("1.0");
        
        //数组有协变性，泛型没有协变性
        //oArray = iArray;
        //oList = strList;
        
        //通配符
        nList.add(1);
        nList.add(1.023);
        //Number n = nList.get(0);
        
        //nList1.add(1);
        //n = nList1.get(0);
        
        nList2.add(1);
        //n = nList2.get(0);
    }
    
    //泛型方法
    public static <T1 extends Number, T2,T> T1 processParam(T1 t1, T2 t2)
    {

        if (t1 instanceof Integer)
        {
            System.err.println("Integer");
        }

        if (t2 instanceof String)
        {
            System.err.println("String");
        }
        else if (t2 instanceof Integer)
        {
            System.err.println("Integer");
        }
        return t1;
    }
    
    //集合泛型
    public static <T, P> Map<String,Collection<?>> complexGenericTest(){
		Collection<Object> c1;
		Collection<Integer> c2;
		List<Object> list1 = new ArrayList<Object>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		//c1 = c2;
		//list1 = list2;
		
		c1 = list1;
		//c1 = list2;
		
		//c2 = list1;
		c2 = list2;
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		Set<String> strSet = new HashSet<String>();
		strSet.add("a");
		strSet.add("b");
		strSet.add("c");
		Map<String,Collection<?>> map = new HashMap<String,Collection<?>>();
		map.put("list", intList);
		map.put("set", strSet);
		return map;
	}
	
    // 打印列表
    public static void DisplayList(List<Object> list)
    {
        for (Object o : list)
        {
            System.err.println((Number) o);
        }
    }

    public static void main(String[] args)
    {
        //类型擦除
        System.err.println(oList.getClass());
        System.err.println(strList.getClass());
        DisplayList(oList);
        processParam(intParam,strParam);
    }
}
