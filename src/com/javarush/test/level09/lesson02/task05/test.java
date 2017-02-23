package com.javarush.test.level09.lesson02.task05;

/**
 * Created by Ivan on 06.04.2016.
 */

class errorChecking {
    public static void main(String[] args) {
        System.out.println("Метод Main успешно запущен");
        m1();
        System.out.println("Метод Main заканчивает свою работу");
    }

    static void m1() {
        try {
            System.out.println("Первый метод передаёт привет!(m1)");
            m2( );
        }
        catch (ArithmeticException err) {
            System.out.println(err.getMessage());
        }
    }

    static void m2() {
        int x = 10;
        int y = 0;
        double z = x / y;
        System.out.println( z );
        System.out.println("Method Two - m2");
    }
}
