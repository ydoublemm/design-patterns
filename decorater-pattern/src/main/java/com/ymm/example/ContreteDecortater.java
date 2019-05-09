package com.ymm.example;

/**
 * @Author: ymm
 * @Date: 2019/5/9 23:51
 * @Description:具体观察角色
 */
public class ContreteDecortater extends Decortater {


    public ContreteDecortater(final Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("增强方法..");
    }
}
