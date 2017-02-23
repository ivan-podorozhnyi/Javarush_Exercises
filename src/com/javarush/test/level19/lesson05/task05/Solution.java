package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
http://ru.wikipedia.org/wiki/%D0%9F%D1%83%D0%BD%D0%BA%D1%82%D1%83%D0%B0%D1%86%D0%B8%D1%8F
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

        String line = "";
        while ((line = bufferedFileReader.readLine()) !=  null) {
            text.add(line);
        }
        for (String s : text) {
            String[] lines = s.split(" ");
            for (String a : lines) {
                finale.add(a.replaceAll("\\p{P}", ""));
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
