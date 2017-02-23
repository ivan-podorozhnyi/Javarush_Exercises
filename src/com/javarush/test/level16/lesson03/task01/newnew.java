package com.javarush.test.level16.lesson03.task01;

import javax.swing.*;

/**
 * Created by Ivan on 02.06.2016.
 */
public class newnew {
    public static void main(String[] args) {
        Reader r = new Reader("Считалка +1");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(300, 300);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
}
