package com.ymm.proto;

/**
 * @Author: ymm
 * @Date: 2019/5/9 23:46
 * @Description:
 */
public class Decortater implements Component {
    private Component component;

    public Decortater(Component component){
        this.component = component;
    }


    @Override
    public void operation() {
        component.operation();
    }
}
