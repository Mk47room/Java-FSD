package com.main;

import com.Utility.PaymentUtil;
import com.beans.Payment;
import com.beans.Upi;
import com.enums.PaymentMode;

import java.time.LocalDate;

public class IsADemo {

    public static void main(String[] args) {
        Payment payment1 = new Upi();
        payment1.setPaymentMode(PaymentMode.UPI);
        payment1.setAmount(20000);
        payment1.setCustomerId(12L);
        payment1.setTransactionDate(LocalDate.now());

        PaymentUtil.makePayment(payment1);
    }
}