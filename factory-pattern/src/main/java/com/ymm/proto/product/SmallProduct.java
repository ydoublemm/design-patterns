package com.ymm.proto.product;

/**
 * @Author: ymm
 * @Date: 2019/4/23 0:48
 * @Description:
 */
public class SmallProduct implements Product{
    @Override
    public void show() {
        System.out.println("这是一个小东西");
    }
}
