package com.ymm;

/**
 * 策略设计模式示例
 * 旅游使用不同的交通工具
 *
 */
public class App {
    public static void main( String[] args ) {
       Tourism t = new Tourism();

       GoWithCar goWithCar = new GoWithCar();
       t.setTransportation(goWithCar);
       t.gogogo();
       System.out.println("===========================");

       GoWithPlane goWithPlane = new GoWithPlane();
       t.setTransportation(goWithPlane);
       t.gogogo();

    }
}
