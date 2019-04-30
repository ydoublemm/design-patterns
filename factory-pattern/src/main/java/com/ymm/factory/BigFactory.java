package com.ymm.factory;

import com.ymm.product.BigProduct;
import com.ymm.product.Product;

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
