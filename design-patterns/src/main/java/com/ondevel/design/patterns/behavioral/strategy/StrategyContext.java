package com.ondevel.design.patterns.behavioral.strategy;

/**
 * Created with IntelliJ IDEA. User: danielpo Date: 21.11.2013 Time: 12:39 To change this template
 * use File | Settings | File Templates.
 */
public class StrategyContext {
  private MathStrategy mathStrategy;

  public StrategyContext(MathStrategy mathStrategy) {
    this.mathStrategy = mathStrategy;
  }
  public int executeStrategy(int a, int b){
    return this.mathStrategy.execute(a,b);
  }

  public void setMathStrategy(MathStrategy mathStrategy) {
    this.mathStrategy = mathStrategy;
  }
}
