package com.example.api.core.billline;

import javax.persistence.Entity;

@Entity
public class ServiceBillLine extends BillLine {
    private String serviceName;

    public ServiceBillLine() {
        super();
    }

    public ServiceBillLine(long id, double price, String serviceName) {
        super(id, price);
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
