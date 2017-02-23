package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        String word = "";

        int count = 0;
        char chars = ' ';
        while (fileReader.ready()) {
            chars = (char) fileReader.read();
            word = word + chars;
        }
        String[] wordText = word.split("[\\p{Punct}\\s]+");
        for (String s : wordText) {
            if (s.equals("world"))
                count++;
        }
        System.out.println(count);
        reader.close();
        fileReader.close();
    }
}
