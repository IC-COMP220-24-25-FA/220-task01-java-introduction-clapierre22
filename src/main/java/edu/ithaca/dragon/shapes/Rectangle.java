package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        // Calculates total area of given Rectangle
        return this.length * this.width;
    }

    public void doubleSize(){
        // Doubles the size of given Rectangle
        double dLength = 2 * this.length;
        double dWidth = 2 * this.width;
        this.length = dLength;
        this.width = dWidth;
    }

    public double longestLineWithin(){
        // Finds the longest straight line in given Rectangle
        return Math.sqrt((this.length * this.length) + (this.width * this.width));
    }

    public static void main(String[] args) {
        // calcAreaTest
        Rectangle tRectangle = new Rectangle(2, 1);
        System.out.println("Should be 2: " + tRectangle.calcArea());

        tRectangle = new Rectangle(4, 10);
        System.out.println("Should be 40: " + tRectangle.calcArea());

        tRectangle = new Rectangle(24, 6);
        System.out.println("Should be 144: " + tRectangle.calcArea());

        // doubleSizeTest
        tRectangle = new Rectangle(2, 1);
        tRectangle.doubleSize();
        System.out.println("Should be 4: " + tRectangle.calcArea());

        tRectangle = new Rectangle(6, 5);
        tRectangle.doubleSize();
        System.out.println("Should be 60: " + tRectangle.calcArea());

        tRectangle = new Rectangle(20, 30);
        tRectangle.doubleSize();
        System.out.println("Should be 1200: " + tRectangle.calcArea());

        // longestLineWithin
        tRectangle = new Rectangle(2, 1);
        System.out.println("Should be 2: " + tRectangle.longestLineWithin());

        tRectangle = new Rectangle(4, 5);
        System.out.println("Should be 5: " + tRectangle.longestLineWithin());
        
        tRectangle = new Rectangle(20, 30);
        System.out.println("Should be 30: " + tRectangle.longestLineWithin());
    }
}
