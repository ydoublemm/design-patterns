package com.ymm.proto;

/**
 * @Author: ymm
 * @Date: 2019-05-09 16:31 
 * @Description:
 *
 */
public class ContreteObserver2 extends Observer {
	@Override
	public void response() {
		System.out.println("观察者2收到通知");
	}
}
