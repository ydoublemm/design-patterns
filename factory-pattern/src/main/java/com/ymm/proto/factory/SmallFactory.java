package com.ymm.proto.factory;

import com.ymm.proto.product.Product;
import com.ymm.proto.product.SmallProduct;

/**
 * @Author: ymm
 * @Date: 2019/4/23 0:49
 * @Description:
 */
public class SmallFactory implements AbstractFactory{
    @Override
    public Product create() {
        //复杂逻辑
        return new SmallProduct();
    }
}
