package com.studies.javaoneforall.oop.enumeration.domain;

public class Customer {
    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                ", paymentType=" + paymentType +
                '}';
    }
}
