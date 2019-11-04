package com.ymm.example;

/**
 * Created by yemingming on 2019-11-04.
 */
public class PhoneDecorate implements Phone {

	private Phone phone;

	public PhoneDecorate(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void call() {
		phone.call();
	}
}
