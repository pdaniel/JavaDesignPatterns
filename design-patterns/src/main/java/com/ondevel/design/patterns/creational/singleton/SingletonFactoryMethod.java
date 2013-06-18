package com.ondevel.design.patterns.creational.singleton;

/**
 * @author: danielpo
 * Date: 6/18/13
 * Time: 11:57 AM
 */
public class SingletonFactoryMethod {
    private SingletonFactoryMethod() {
        throw new RuntimeException("No init");
    }

    private static final SingletonFactoryMethod instance = new SingletonFactoryMethod();

    public static SingletonFactoryMethod getInstance(){
         return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Can not create clone of SingletonDoubleCheck class");
    }

    private Object readResolve(){
        return instance;
    }

    private Object writeResolve(){
        return instance;
    }

}
