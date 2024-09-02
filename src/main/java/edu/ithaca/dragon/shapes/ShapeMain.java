package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        Random randNum = new Random();

        ArrayList<Rectangle> randRecList = new ArrayList<>();

        randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));
        randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));
        randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));
        randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));
        randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));

        for (Rectangle i : randRecList) {
            System.out.println("Random Rectangle Area: " + i.calcArea() + " Random Rectangle Longest Line: " + i.longestLineWithin());
        }

        Scanner doubleIn = new Scanner(System.in);
        System.out.println("Which Rectangle would you like to have Doubled?");

        int counter = doubleIn.nextInt();
        System.out.println("Counter is " + counter);


    }
}
