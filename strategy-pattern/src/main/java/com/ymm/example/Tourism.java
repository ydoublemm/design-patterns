package com.ymm.example;

import lombok.Data;

/**
 * @Author: ymm
 * @Date: 2019/4/21 21:59
 * @Description:旅游
 */
@Data
public class Tourism {

    private Transportation transportation;

    public void gogogo(){
        transportation.go();
    }
}
