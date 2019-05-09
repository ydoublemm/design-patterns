package com.ymm.proto;

import com.ymm.proto.factory.BigFactory;
import com.ymm.proto.factory.SmallFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        new BigFactory().create().show();
        new SmallFactory().create().show();
    }
}
