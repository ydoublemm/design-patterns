package com.ymm.proto;

/**
 * @Author: ymm
 * @Date: 2019-05-09 16:26 
 * @Description:
 *
 */
public class ContreteSubject extends Subject{

	@Override
	public void notifyObservers() {
		this.observerList.forEach(
				observer -> {
					observer.response();
				}
		);
	}
}
