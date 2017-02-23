package com.javarush.test.level06.lesson05.task04;

/**
 * Created by Ivan on 06.02.2016.
 */



    class Cat1                   //класс
    {
        String name;            //обычная переменная
        static int cat1Count;    //статическая переменная

        Cat1(String name)
        {
            this.name = name;
            Cat1.cat1Count++;   //увеличиваем значение статический переменной на 1
        }

        public static void main(String[] args) {

            System.out.println(Cat1.cat1Count);
            Cat1 cat1 = new Cat1("Vaska");

            System.out.println(Cat1.cat1Count);
            Cat1 cat2 = new Cat1("Murka");

            System.out.println(cat1.name);
            System.out.println(cat2.name);
            System.out.println(Cat1.cat1Count);
        }
    }



