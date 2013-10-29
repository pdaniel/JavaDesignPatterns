package com.ondevel.design.patterns.businessdelegate;

/**
 * @author Daniel P.
 *         Date: 29.10.2013
 */
public class QMPService implements BusinessService {
    @Override
    public void showMessage() {
        System.out.println("QMPService");
    }
}
