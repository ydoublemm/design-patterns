package com.ymm.example;

/**
 * @Author: ymm
 * @Date: 2019-05-09 18:00 
 * @Description:
 *
 */
public class RMBRate extends Rete{

	@Override
	public void change(int rate) {
		for (Company company : super.companyList) {
			company.response(rate);
		}
	}
}
