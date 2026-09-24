package com.Utility;

import com.beans.Payment;

public class PaymentUtil {

    public static void makePayment(Payment payment){ // this depends upon Payment class
        System.out.println("Your payment goes thru key: " + payment.getGatewayKey());
        System.out.println("Payment made to customer with id " + payment.getCustomerId());
        System.out.println("Payment mode " + payment.getPaymentMode());
        System.out.println("payment amount " + payment.getAmount());
        System.out.println("payment date " + payment.getTransactionDate());
    }
}