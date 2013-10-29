package com.ondevel.design.patterns.businessdelegate;

/**
 * @author Daniel P.
 *         Date: 29.10.2013
 */
public class BusinessDelegate {
    private BusinessLookup businessLookup = new BusinessLookup();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public BusinessDelegate(String serviceType) {
        this.serviceType = serviceType;
    }

    public void execute(){
        businessService = businessLookup.getBusinessService(serviceType);
        businessService.showMessage();
    }
}
