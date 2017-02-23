package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
public Money(double amount)
    {
        this.amount = amount;
    }

    public double getAmount()
    {
        return this.amount;
    }

    public abstract String getCurrencyName();

    private double amount = 10;
}
