package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        ArrayList<String> text = new ArrayList<String>();
        ArrayList<String> finale = new ArrayList<String>();

        String line = " ";
        while ((line = bufferedFileReader.readLine()) !=  null) {
            text.add(line);
        }
        for (String s : text) {
            String[] lines = s.split(" ");
            for (String a : lines) {
                finale.add(a.replace(".", "!"));
            }
        }
        for (String i : finale) {
            fileWriter.write(i + " ");
        }
        bufferedReader.close();
        bufferedFileReader.close();
        fileWriter.close();

    }
}
