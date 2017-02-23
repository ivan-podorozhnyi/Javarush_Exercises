package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private int age;
        private int height;
        private String firstName;
        private String lastName;
        private int weight;
        private int brains;

        public Human(String lastName, int weight)
        {
            this.lastName = lastName;
            this.weight = weight;
        }

        public Human(int height, String firstName, String lastName, int weight, int brains)
        {

            this.height = height;
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
            this.brains = brains;
        }

        public Human(int height, String firstName, String lastName, int weight)
        {

            this.height = height;
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
        }

        public Human(int height, String firstName, String lastName)
        {

            this.height = height;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(int height, String firstName)
        {

            this.height = height;
            this.firstName = firstName;
        }

        public Human(int age, int height, String firstName, String lastName, int weight)
        {

            this.age = age;
            this.height = height;
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
        }

        public Human(int age, int height, String firstName, String lastName)
        {

            this.age = age;
            this.height = height;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(int age, int height, String firstName)
        {

            this.age = age;
            this.height = height;
            this.firstName = firstName;
        }

        public Human(int age, int height)
        {

            this.age = age;
            this.height = height;
        }

        public Human(int age, int height, String firstName, String lastName, int weight, int brains)
        {

            this.age = age;
            this.height = height;
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
            this.brains = brains;
        }

        //напишите тут ваши переменные и конструкторы
    }
}
