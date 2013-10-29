package com.ondevel.design.patterns.businessdelegate;

/**
 * @author Daniel P.
 *         Date: 29.10.2013
 */
public class AMPService implements BusinessService {
    @Override
    public void showMessage() {
        System.out.println("AMP Service");
    }
}
