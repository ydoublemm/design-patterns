package com.ymm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ContreteSubject subject = new ContreteSubject();
        Observer observer1 = new ContreteObserver1();
        Observer observer2 = new ContreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObservers();
    }
}
