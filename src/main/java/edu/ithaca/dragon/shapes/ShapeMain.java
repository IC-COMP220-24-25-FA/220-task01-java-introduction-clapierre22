package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShapeMain {
    
    public static void main(String[] args){
        ArrayList<Shape> shapeList = new ArrayList<>();

        Random randShape = new Random();
        Random randNum = new Random();

        for (int i = 0; i < 10; i++) {
            int counter = 0;
            counter = randShape.nextInt(3);
            if (counter == 0) {
                shapeList.add(new Rectangle(randNum.nextDouble(25), randNum.nextDouble(30)));
            }
            else if (counter == 1) {
                shapeList.add(new Circle(randNum.nextDouble(25)));
            }
            else if (counter == 2) {
                shapeList.add(new Triangle(randNum.nextDouble(20), randNum.nextDouble(20)));
            }
        }

        for (Shape a : shapeList) {
            System.out.println(a.toString());
        }

        for (Shape b : shapeList) {
            b.doubleSize();
            System.out.println(b);
        }

        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

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
