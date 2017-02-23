package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter{

    private FileOutputStream amigo;
    AdapterFileOutputStream (FileOutputStream amigo){
        this.amigo = amigo;
    }

    @Override
    public void flush() throws IOException {
        this.amigo.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        this.amigo.write(s.getBytes());
    }

    @Override
    public void close() throws IOException {
        this.amigo.close();
    }
}

