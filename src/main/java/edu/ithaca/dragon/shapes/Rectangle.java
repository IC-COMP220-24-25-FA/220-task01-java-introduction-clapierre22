package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       return this.length * this.width;
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


        tRectangle = new Rectangle(2, 1);
        tRectangle.doubleSize();
        System.out.println("Should be 4: " + tRectangle.calcArea());

        tRectangle = new Rectangle(6, 5);
        tRectangle.doubleSize();
        System.out.println("Should be 60: " + tRectangle.calcArea());

        tRectangle = new Rectangle(20, 30);
        tRectangle.doubleSize();
        System.out.println("Should be 1200: " + tRectangle.calcArea());
    }
}
