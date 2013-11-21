package com.ondevel.design.patterns.behavioral.strategy;

/**
 * Created with IntelliJ IDEA. User: danielpo Date: 21.11.2013 Time: 12:39 To change this template
 * use File | Settings | File Templates.
 */
public class SubtractStrategy implements MathStrategy {
  @Override public int execute(int a, int b) {
    return a-b;
  }
}
