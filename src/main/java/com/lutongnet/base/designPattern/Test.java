/**
* File Name : Test.java
* Functions:
* TODO
*
* History:
*  Date          Modified_By
* 2014年7月18日           lvhao          
*
*  Copyright (c) 2013-2015 lutongnet Corporation. All rights reserved.
*
*/

package com.lutongnet.base.designPattern;

import com.lutongnet.base.designPattern.actionType.observer.Bank;
import com.lutongnet.base.designPattern.actionType.observer.Evildoer;
import com.lutongnet.base.designPattern.actionType.observer.MonitoredObject;
import com.lutongnet.base.designPattern.actionType.observer.Observer;
import com.lutongnet.base.designPattern.actionType.observer.Police;
import com.lutongnet.base.designPattern.actionType.responsibilityChain.MyHandler;
import com.lutongnet.base.designPattern.generateType.builder.VehicleBuilder;
import com.lutongnet.base.designPattern.generateType.factory.abstractFactory.AutomobileProvider;
import com.lutongnet.base.designPattern.generateType.factory.abstractFactory.BicycleProvider;
import com.lutongnet.base.designPattern.generateType.factory.abstractFactory.VehicleProvider;
import com.lutongnet.base.designPattern.generateType.factory.genericFactory.MultiMethodFactory;
import com.lutongnet.base.designPattern.generateType.factory.genericFactory.SimpleFactory;
import com.lutongnet.base.designPattern.generateType.factory.genericFactory.StaticMethodFactory;
import com.lutongnet.base.designPattern.generateType.factory.genericFactory.Vehicle;
import com.lutongnet.base.designPattern.generateType.singleton.SingletonPool;
import com.lutongnet.base.designPattern.structureType.adapter.BicycleAdapter;

/**
 * 
 * @author     lvhao
 * @since       | 
 */

public class Test
{
    /**
     * 构造型-普通工厂、抽象工厂、单例、原型、建造者
     */
    
    //简单工厂
    public static void simpleFactoryTest(){
        SimpleFactory gf = new SimpleFactory();
        Vehicle v = gf.getVehicle("bicycle");
        v.run();
        v = gf.getVehicle("automobile");
        v.run();
    }
    
    //多方法工厂
    public static void multiMethodFactoryTest(){
        MultiMethodFactory mf = new MultiMethodFactory();
        Vehicle v = null;
        v = mf.getAutoMobile();
        v.run();
        v = mf.getBicycle();
        v.run();
    }
    
    //静态工厂
    public static void staticMethodFactoryTest(){
        StaticMethodFactory.getAutoMobile().run();
        StaticMethodFactory.getBicycle().run();
    } 
    
    //抽象工厂
    public static void abstractFactoryTest(){
        VehicleProvider vp = new AutomobileProvider();
        vp.getVehicle().run();
        vp = new BicycleProvider();
        vp.getVehicle().run();
    }
    
    //建造者
    public static void vehicleBuilderTest(){
        VehicleBuilder vb = new VehicleBuilder();
        vb.produceAutomobile(10);
        vb.produceBicycle(100);
    }
    
    //单例模式
    public static void singletonPoolTest(){
        SingletonPool sp = SingletonPool.getInstance();
        SingletonPool sp1 = SingletonPool.getInstance();
        System.err.println(sp == sp1);
        
    }
    
    /**
     * 结构型-类、对象、接口
     */
    
    //类适配器
    public static void bicycleAdapterTest(){
        BicycleAdapter ba = new BicycleAdapter();
        ba.charge();
        ba.run();
    }
    
    /**
     * 行为型
     */
    //观察者
    public static void observerTest(){
        MonitoredObject mo = new Bank();
        Observer police = new Police();
        Observer evildoer = new Evildoer();
        
        mo.add(police);
        mo.add(evildoer);
        mo.operate();
    }
    
    //责任链
    public static void responsibilityChainTest(){
        MyHandler myhd1 = new MyHandler("myhd1");
        MyHandler myhd2 = new MyHandler("myhd2");
        MyHandler myhd3 = new MyHandler("myhd3");
        MyHandler myhd4 = new MyHandler("myhd4");
        
        myhd1.setHandler(myhd2);
        myhd2.setHandler(myhd3);
        myhd3.setHandler(myhd4);
        
        myhd1.processReq();
    }
    
    public static void main(String[] args)
    {
        //simpleFactoryTest();
        //multiMethodFactoryTest();
        //staticMethodFactoryTest();
        //abstractFactoryTest();
        //vehicleBuilderTest();
        //singletonPoolTest();
        //bicycleAdapterTest();
        //observerTest();
        responsibilityChainTest();
    }
}
