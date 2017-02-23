package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle

{

    private int rectangleleft;
    private int rectangletop;
    private int rectangleheight;
    private int rectangleWidth;



    public void initialize(int left, int top, int height, int width)
    {
        rectangleleft = left;
        rectangletop = top;
        rectangleWidth = width;
        rectangleheight = height;

    }

    public void initialize(int left, int top)
    {
        rectangleleft = left;
        rectangletop = top;


    }

    public void initialize(int left)
    {
        rectangleleft = left;

    }
    public void initialize(int left, int top, int height)
    {
        rectangleleft = left;
        rectangletop = top;
        rectangleheight = height;

    }
}
