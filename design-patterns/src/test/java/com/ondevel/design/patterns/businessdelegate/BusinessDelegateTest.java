package com.ondevel.design.patterns.businessdelegate;

import org.junit.Test;

/**
 * @author Daniel P.
 *         Date: 29.10.2013
 */
public class BusinessDelegateTest {
    @Test
    public void testBusinessDelegate(){
        BusinessDelegate bd = new BusinessDelegate("amp");
        BusinessDelegateClient client = new BusinessDelegateClient(bd);
        client.execute();
    }
}
