package com.ondevel.design.patterns.creational.singleton;

/**
 * @author: danielpo
 * Date: 6/18/13
 * Time: 12:04 PM
 */
public class SingletonBillPughWay {

    private SingletonBillPughWay() {
        throw new RuntimeException("No contructor allowed");
    }

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder {
        public static final SingletonBillPughWay INSTANCE = new SingletonBillPughWay();
    }

    public static SingletonBillPughWay getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
