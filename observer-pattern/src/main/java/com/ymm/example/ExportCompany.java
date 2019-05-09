package com.ymm.example;

/**
 * @Author: ymm
 * @Date: 2019-05-09 18:02 
 * @Description:
 *
 */
public class ExportCompany extends Company {
	@Override
	public void response(int rate) {
		if(rate < 0){
			System.out.println("进口公司笑了");
		}else {
			System.out.println("进口公司哭了");
		}
	}
}
