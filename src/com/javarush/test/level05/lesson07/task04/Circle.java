package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle

{

    private int circleCenterx;
    private int circleCentery;
    private int circleRadius;
    private int circleWidth;
    private String circleColor;


    public void initialize(int centerx, int centery, int radius)
    {
        circleCenterx = centerx;
        circleCentery = centery;
        circleRadius = radius;

    }

    public void initialize(int centerx, int centery, int radius, int width)
    {
        circleCenterx = centerx;
        circleCentery = centery;
        circleRadius = radius;
        circleWidth = width;

    }

    public void initialize(int centerx, int centery, int radius, int width, String color)
    {
        circleCenterx = centerx;
        circleCentery = centery;
        circleRadius = radius;
        circleWidth = width;
        circleColor = color;

    }
}
