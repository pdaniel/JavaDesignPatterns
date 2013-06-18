package com.ondevel.design.patterns.creational;

import com.ondevel.design.patterns.creational.singleton.SingletonEnum;
import org.junit.Test;

/**
 * @author: danielpo
 * Date: 6/18/13
 * Time: 12:11 PM
 */
public class SingletonTest {
    @Test
    public void testSingletonEnume(){
        SingletonEnum.INSTANCE.consoleWrite();//direct variable call
        SingletonEnum.getInstance().consoleWrite(); //using getInstance Method
    }

}
