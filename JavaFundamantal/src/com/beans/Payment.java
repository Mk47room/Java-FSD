package com.beans;

import com.enums.PaymentMode;

import java.time.LocalDate;

public abstract class Payment {

    private PaymentMode paymentMode;
    private double amount;
    private long customerId;
    private LocalDate transactionDate;

    public String getGatewayKey(){ // i get gateway key if i just call this method
        return "ABG-YT3-UI67-JHK";
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public abstract void setPaymentMode(PaymentMode paymentMode) ;

    public double getAmount() {
        return amount;
    }

    public abstract void setAmount(double amount) ;

    public long getCustomerId() {
        return customerId;
    }

    public abstract void setCustomerId(long customerId);

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public abstract void setTransactionDate(LocalDate transactionDate);
}