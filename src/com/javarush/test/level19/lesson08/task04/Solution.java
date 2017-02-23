package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException
    {


        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        String[] array = result.split(" ");
        int one = Integer.parseInt(array[0]);
        int two = Integer.parseInt(array[2]);
        System.setOut(consoleStream);
        int three = 0;
        if (array[1].equals("+")) {
            three = one + two;
        }
        else if (array[1].equals("-")) {
            three = one - two;
        }
        else three = one * two;
        System.out.println(one + " " + array[1] + " " + two + " = " + three);
        consoleStream.close();
        stream.close();

        System.setOut(consoleStream);

        outputStream.close();
        stream.close();


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

