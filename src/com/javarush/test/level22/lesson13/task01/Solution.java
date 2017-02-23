package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> text = new ArrayList<>();
        StringTokenizer tokenizer =
                new StringTokenizer(query,delimiter);
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
            text.add(token);
        }
        String result = text.toString();
        String[] myArray = text.toArray(new String[text.size()]);
        return myArray;
    }

    public static void main(String[] args)
    {
        getTokens("abcdasfsfgadsgggg","a");
    }
}
