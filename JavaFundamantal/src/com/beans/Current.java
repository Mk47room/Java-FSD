package com.beans;

public class Current implements Account{
    @Override
    public double getInterestRate() {
        return 3.0;
    }
}