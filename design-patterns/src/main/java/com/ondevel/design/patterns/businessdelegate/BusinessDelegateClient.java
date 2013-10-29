package com.ondevel.design.patterns.businessdelegate;

/**
 * @author Daniel P.
 *         Date: 29.10.2013
 */
public class BusinessDelegateClient {
    BusinessDelegate delegate;

    public BusinessDelegateClient(BusinessDelegate delegate) {
        this.delegate = delegate;
    }

    public void execute() {
        delegate.execute();
    }
}
