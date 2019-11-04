package com.ymm.proto;

/**
 * @Author: ymm
 * @Date: 2019/5/9 23:44
 * @Description: 具体构建角色
 */
public class ConcreteComponent implements Component{

    public ConcreteComponent(){
        System.out.println("创建具体角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构建角色的方法");
    }
}
