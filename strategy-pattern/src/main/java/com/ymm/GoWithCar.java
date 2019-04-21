package com.ymm;

/**
 * @Author: ymm
 * @Date: 2019/4/21 22:03
 * @Description:
 */
public class GoWithCar implements Transportation{
    @Override
    public void go() {
        System.out.println("使用 \'汽车\' 出行!");
    }
}
