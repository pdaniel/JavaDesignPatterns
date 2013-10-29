package com.ondevel.design.patterns.businessdelegate;

/**
 * @author Daniel P.
 *         Date: 29.10.2013
 */
public class BusinessLookup {
    public BusinessService getBusinessService(String serviceType){
         if(serviceType.equalsIgnoreCase("AMP")){
             return new AMPService();
         }else{
             return new QMPService();
         }
    }
}
