package com.ymm.example;

/**
 * @Author: ymm
 * @Date: 2019/5/9 23:46
 * @Description:抽象观察角色
 */
public class Decortater implements Component {
    private Component component;

    public Decortater(Component component){
        this.component = component;
    }


    @Override
    public void operation() {
        this.component.operation();
    }
}
