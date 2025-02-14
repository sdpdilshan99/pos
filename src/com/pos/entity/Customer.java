package com.pos.entity;

public class Customer implements SuperEntity{
    private String CustomerId;
    private String CustomerName;
    private String CustomerAddress;
    private double CustomerSalary;
    private String CustomerPhone;

    public Customer() {
    }

    public Customer(String customerId, String customerName, String customerAddress, double customerSalary, String customerPhone) {
        CustomerId = customerId;
        CustomerName = customerName;
        CustomerAddress = customerAddress;
        CustomerSalary = customerSalary;
        CustomerPhone = customerPhone;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public double getCustomerSalary() {
        return CustomerSalary;
    }

    public void setCustomerSalary(double customerSalary) {
        CustomerSalary = customerSalary;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        CustomerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerId='" + CustomerId + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerAddress='" + CustomerAddress + '\'' +
                ", CustomerSalary=" + CustomerSalary +
                ", CustomerPhone='" + CustomerPhone + '\'' +
                '}';
    }
}
