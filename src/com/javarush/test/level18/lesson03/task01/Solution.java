package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {





        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream=new FileInputStream(new File(reader.readLine()));
        int a;
        int max=0;
        while (inputStream.available() > 0) {
            a=inputStream.read();


            if (max < a) {
                max=a;

            }



        }
        System.out.println(max);
        inputStream.close();
        reader.close();


    }
}
