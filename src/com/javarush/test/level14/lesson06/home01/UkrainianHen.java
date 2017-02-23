package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ivan on 17.04.2016.
 */
public class UkrainianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 10;
    }
    String getDescription(){
        return super.getDescription()+ " Моя страна - " + Country.UKRAINE + ". Я несу " +this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
