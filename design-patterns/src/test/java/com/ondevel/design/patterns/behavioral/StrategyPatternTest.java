package com.ondevel.design.patterns.behavioral;

import com.ondevel.design.patterns.behavioral.strategy.AddStrategy;
import com.ondevel.design.patterns.behavioral.strategy.StrategyContext;
import com.ondevel.design.patterns.behavioral.strategy.SubtractStrategy;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA. User: danielpo Date: 21.11.2013 Time: 12:40 To change this template
 * use File | Settings | File Templates.
 */
public class StrategyPatternTest {
  @Test
  public void testMathStrategy() throws Exception {
    StrategyContext context = new StrategyContext(new AddStrategy());
    int res = context.executeStrategy(2,3);
    Assert.assertEquals(5,res);
    context.setMathStrategy(new SubtractStrategy());
    res = context.executeStrategy(5,3);
    Assert.assertEquals(2,res);

  }
}
