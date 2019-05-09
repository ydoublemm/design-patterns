package com.ymm.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ymm
 * @Date: 2019-05-09 17:54 
 * @Description:
 *
 */
public abstract class Rete {
	List<Company> companyList = new ArrayList<>();

	public void add(Company company){
		companyList.add(company);
	}

	public void remove(Company company){
		companyList.remove(company);
	}

	public  abstract void change(int rate);
}
