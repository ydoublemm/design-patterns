package com.ymm.example;

/**
 * Created by yemingming on 2019-11-04.
 */
public class MusicPhone extends PhoneDecorate {
	public MusicPhone(Phone phone) {
		super(phone);
	}

	public void listen(){
		System.out.println("听音乐");
	}

	@Override
	public void call() {
		listen();
		super.call();
	}
}
