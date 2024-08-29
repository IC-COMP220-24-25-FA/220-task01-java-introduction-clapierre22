package edu.ithaca.dragon.shapes;

public class Rectangle {
    

    public Rectangle(double length, double width){
        throw new RuntimeException("Not implemented yet");
    }

    public double calcArea(){
       throw new RuntimeException("Not implemented yet");
    }

    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }

    public static void main(String[] args) {
        Rectangle tRectangle = new Rectangle(2, 1);
        System.out.println("Should be 2: " + tRectangle.calcArea());

        tRectangle = new Rectangle(4, 10);
        System.out.println("Should be 40: " + tRectangle.calcArea());

        tRectangle = new Rectangle(24, 6);
        System.out.println("Should be 144: " + tRectangle.calcArea());
    }
    
}
