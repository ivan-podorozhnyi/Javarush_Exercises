package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream=new FileInputStream(new File(reader.readLine()));
        int a;
        int min=500;
        while (inputStream.available() > 0) {
            a=inputStream.read();


            if (min > a) {
                min=a;

            }



        }
        System.out.println(min);
        inputStream.close();
        reader.close();


    }
}
