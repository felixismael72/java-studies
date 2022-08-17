package com.studies.javaoneforall.oop.enumeration.test;

import com.studies.javaoneforall.oop.enumeration.domain.Customer;
import com.studies.javaoneforall.oop.enumeration.domain.CustomerType;
import com.studies.javaoneforall.oop.enumeration.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Sanji", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Brook", CustomerType.COMPANY, PaymentType.CREDIT);
        Customer customer3 = new Customer("Nami", CustomerType.STARTUP, PaymentType.DEBIT);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(PaymentType.CREDIT.calculateDiscount(150));
    }
}
