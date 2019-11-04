package com.ymm.example;

/**
 * Created by yemingming on 2019-11-04.
 */
public class App {

	public static void main(String[] args) {
		Phone iphone  = new IPhoneX();

		PhoneDecorate phone = new MusicPhone(iphone);

		phone = new GiveTimePhone(phone);

		phone.call();

	}
}
