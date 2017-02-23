package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Ivan on 01.07.2016.
 */
public class Hippodrome {

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse horse : horses)
        {
            if (horse.getDistance() > winner.getDistance())
                winner = horse;
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is "+getWinner().getName()+"!");
    }

    public static Hippodrome game;


    public static void main(String[] args) throws InterruptedException {

        game=new Hippodrome();

        Horse horse1=new Horse("Gomer", 3, 0);
        Horse horse2=new Horse("Bart", 3, 0);
        Horse horse3=new Horse("Simpson", 3, 0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse3);
        game.getHorses().add(horse2);
        game.run();
        game.printWinner();


    }

    private ArrayList<Horse> horses=new ArrayList<>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i=0; i < 100; i++) {
            move();
            print();
            Thread.sleep(50);
        }
    }

    public void move() {
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : getHorses()) {
            horse.print();
            System.out.println();
            System.out.println();
        }
    }


}
