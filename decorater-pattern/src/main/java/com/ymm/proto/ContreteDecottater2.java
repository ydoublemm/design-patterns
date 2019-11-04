package com.ymm.proto;

/**
 * Created by yemingming on 2019-11-02.
 */
public class ContreteDecottater2 extends Decortater {
	public ContreteDecottater2(Component component) {
		super(component);
	}


	@Override
	public void operation() {
		System.out.println("增强方法。。2");
		super.operation();
	}
}
