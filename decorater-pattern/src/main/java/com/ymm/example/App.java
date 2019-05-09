package com.ymm.example;

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
        decortater.operation();
    }
}
