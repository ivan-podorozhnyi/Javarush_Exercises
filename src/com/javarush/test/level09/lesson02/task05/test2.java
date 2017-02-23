package com.javarush.test.level09.lesson02.task05;

/**
 * Created by Ivan on 06.04.2016.
 */
class Customer
{
    private String name;

    // Other fields, constructors, get, set, etc.
    //
    public Customer(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
// Other methods.

class Rental
{
    private int kind;
    private int days;

    // Other fields, constructors, get, set, etc.
    //
    public Rental(int kind, int days)
    {
        this.kind = kind;
        this.days = days;
    }

    public int getKind()
    {
        return kind;
    }

    public void setKind(int kind)
    {

        this.kind = kind;
    }

    public int getDays()
    {
        return days;
    }

    public void setDays(int days)
    {
        this.days = days;
    }

    public double getBasePrice()
    {
        return 100;// Calculation of Price.
        // . . .
    }

    private double amountFor(Rental rental)
    {
        double result;
        // Another code.
        result = rental.getDays() * rental.getBasePrice();
        if (rental.getKind() == 1)
        {
            result = result * 1.5;
        }
        if (rental.getKind() == 2)
        {
            result = result * 2;
        }
        if (rental.getKind() == 3)
        {
            result = result * 2.5;
        }
        if (rental.getDays() > 7)
        {
            result = result * 3;
        }
        // Other calculation.
        return result;
        // Other methods.
    }
}
