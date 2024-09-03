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

        Rectangle randRec1 = new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25));
        Rectangle randRec2 = new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25));
        Rectangle randRec3 = new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25));
        Rectangle randRec4 = new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25));
        Rectangle randRec5 = new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25));

        randRecList.add(randRec1);
        randRecList.add(randRec2);
        randRecList.add(randRec3);
        randRecList.add(randRec4);
        randRecList.add(randRec5);

        // randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));
        // randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));
        // randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));
        // randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));
        // randRecList.add(new Rectangle(randNum.nextDouble(20), randNum.nextDouble(25)));

        for (Rectangle i : randRecList){
            System.out.println("Random Rectangle Area: " + i.calcArea() + " Random Rectangle Longest Line: " + i.longestLineWithin());
        }
        int j = 0;
        while (j < 5){
            Scanner doubleIn = new Scanner(System.in);
            System.out.println("Which Rectangle would you like to have Doubled?");

            int counter = (doubleIn.nextInt()) - 1;
            System.out.println("Counter is " + (counter + 1));

            Rectangle randRecD = randRecList.get(counter);
            randRecD.doubleSize();
            randRecList.set(counter, randRecD);

            for (Rectangle i : randRecList){
                System.out.println("Random Rectangle Area: " + i.calcArea() + " Random Rectangle Longest Line: " + i.longestLineWithin());
            }
            j++;
        }
    }
}
