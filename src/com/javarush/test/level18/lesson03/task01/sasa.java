package com.javarush.test.level18.lesson03.task01;

/**
 * Created by Ivan on 02.05.2016.
 */

public class sasa {
public static void main(String [] args) {
        String [][] argCopy = new String[2][2];
        int x;
        argCopy[0] = args;
        x = argCopy[0].length;
        for (int y = 0; y < x; y++) {
        System.out.print(" " + argCopy[0][y]);
        }
        }
        }




