package com.ymm.example;

import org.omg.DynamicAny._DynAnyFactoryStub;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yemingming on 2019-11-04.
 */
public class GiveTimePhone extends PhoneDecorate {
	public GiveTimePhone(Phone phone) {
		super(phone);
	}

	void giveTime(){
		System.out.println(new Date());
	}


	@Override
	public void call() {
		giveTime();
		super.call();
	}
}
