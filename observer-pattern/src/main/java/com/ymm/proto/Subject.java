package com.ymm;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: ymm
 * @Date: 2019-05-09 16:14 
 * @Description:
 *
 */
// 抽象目标
public abstract class Subject {
	List<Observer> observerList = new LinkedList<>();

	public void add(Observer observer){
		observerList.add(observer);
	}

	public void remove(Observer observer){
		observerList.remove(observer);
	}

	public abstract void notifyObservers();
}



