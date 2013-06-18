package com.ondevel.design.patterns.creational.singleton;

/**
 * @author: danielpo
 * Date: 6/18/13
 * Time: 12:05 PM
 * After Java 5 the best way to create a singleton si through an Enum
 */
public enum SingletonEnum {
    INSTANCE;

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

    public void consoleWrite(){
        System.out.println("SingletonEnum message.");
    }
}
