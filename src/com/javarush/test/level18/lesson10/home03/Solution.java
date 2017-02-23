package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String one = reader.readLine();
        String two = reader.readLine();
        String three = reader.readLine();
        FileOutputStream out = new FileOutputStream(one);
        FileInputStream in1 = new FileInputStream(two);
        FileInputStream in2 = new FileInputStream(three);

        while (in1.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = in1.read(); // прочитать очередной байт в переменную data
            out.write(data); // и записать его во второй поток
        }

        while (in2.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = in2.read(); // прочитать очередной байт в переменную data
            out.write(data); // и записать его во второй поток
        }

        reader.close();
        out.close();
        in1.close();
        in2.close();

    }
}
