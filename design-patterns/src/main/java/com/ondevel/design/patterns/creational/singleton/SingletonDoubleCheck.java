package com.ondevel.design.patterns.creational.singleton;

/**
 * @author: danielpo
 * Date: 6/18/13
 * Time: 11:40 AM
 */
public class SingletonDoubleCheck {
    private SingletonDoubleCheck() {
        throw new RuntimeException("No contructor allowed");
    }

    private static volatile SingletonDoubleCheck instance;

    public static SingletonDoubleCheck getInstance(){
         if(instance==null){
             //double check locking
             synchronized (SingletonDoubleCheck.class){
                 if(instance==null){
                      instance = new SingletonDoubleCheck();
                 }
             }
         }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Can not create clone of singleton class");
    }

    private Object readResolve(){
        return instance;
    }

    private Object writeResolve(){
        return instance;
    }
}
