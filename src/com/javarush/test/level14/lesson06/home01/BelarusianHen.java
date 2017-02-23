package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ivan on 17.04.2016.
 */
public class BelarusianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 5;
    }
    String getDescription(){
        return super.getDescription()+ " Моя страна - " + Country.BELARUS + ". Я несу " +this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
