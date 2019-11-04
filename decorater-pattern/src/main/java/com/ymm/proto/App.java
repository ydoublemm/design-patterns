package com.ymm.proto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Component component = new ConcreteComponent();
        Decortater decortater = new ContreteDecortater(component);
        decortater = new ContreteDecottater2(decortater);
        decortater.operation();
    }
}
