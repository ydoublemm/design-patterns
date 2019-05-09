package com.ymm.proto.factory;

import com.ymm.proto.product.BigProduct;
import com.ymm.proto.product.Product;

/**
 * @Author: ymm
 * @Date: 2019/4/23 0:32
 * @Description:
 */
public class BigFactory implements AbstractFactory {
    @Override
    public Product create() {
        //复杂逻辑
        return new BigProduct();
    }
}
