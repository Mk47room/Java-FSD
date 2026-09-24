package com.beans;


import com.enums.PaymentMode;

import java.time.LocalDate;

public class Upi extends  Payment{

    private PaymentMode paymentMode;
    private double amount;
    private long customerId;
    private LocalDate transactionDate;

    @Override
    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount + 2;
    }

    @Override
    public void setCustomerId(long customerId) {
        // check the DB
        this.customerId = customerId;
    }

    @Override
    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }


    @Override
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public long getCustomerId() {
        return customerId;
    }

    @Override
    public LocalDate getTransactionDate() {
        return transactionDate;
    }
}