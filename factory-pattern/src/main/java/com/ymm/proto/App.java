package com.ymm;

import com.ymm.factory.BigFactory;
import com.ymm.factory.SmallFactory;

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
