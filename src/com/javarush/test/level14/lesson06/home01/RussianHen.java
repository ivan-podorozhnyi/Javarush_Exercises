package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ivan on 17.04.2016.
 */
public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 0;
    }
    String getDescription(){
        return super.getDescription()+ " Моя страна - " + Country.RUSSIA + ". Я несу " +this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
