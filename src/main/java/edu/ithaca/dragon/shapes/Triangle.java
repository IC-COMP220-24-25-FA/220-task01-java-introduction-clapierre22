package edu.ithaca.dragon.shapes;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double baseIn, double heightIn){
        base = baseIn;
        height = heightIn;
    }
    
    public double calcArea(){
        // Calculatess the area of the given Triangle
        return (base * height) / 2;
    }

    public void doubleSize(){
        // Doubles the size of the given Triangle, doubles the height and base values and does not calculate
        double dBase = 2 * base;
        double dHeight = 2 * height;
        base = dBase;
        height = dHeight;
    }

    public double longestLineWithin(){
        // Finds the longest straight line within the given Triangle
        double lLine = 0;
        if (base > height){
            lLine = base;
        }
        else {
            lLine = height;
        }
        return lLine;
    }

    public static void main(String[] args) {
        // calcAreaTest
        Triangle tTriangle = new Triangle(2, 2);
        System.out.println("Should be 2: " + tTriangle.calcArea());

        tTriangle = new Triangle(6, 3);
        System.out.println("Should be 9: " + tTriangle.calcArea());

        tTriangle = new Triangle(5, 10);
        System.out.println("Should be 25: " + tTriangle.calcArea());

        // doubleSizeTest
        tTriangle = new Triangle(2, 2);
        tTriangle.doubleSize();
        System.out.println("Should be 8: " + tTriangle.calcArea());

        tTriangle = new Triangle(6, 10);
        tTriangle.doubleSize();
        System.out.println("Should be 120: " + tTriangle.calcArea());

        tTriangle = new Triangle(11, 5);
        tTriangle.doubleSize();
        System.out.println("Should be 110: " + tTriangle.calcArea());

        //longestLineWithinTest
        tTriangle = new Triangle(2, 2);
        System.out.println("Should be 2: " + tTriangle.longestLineWithin());

        tTriangle = new Triangle(8, 3);
        System.out.println("Should be 8: " + tTriangle.longestLineWithin());

        tTriangle = new Triangle(12, 20);
        System.out.println("Should be 20: " + tTriangle.longestLineWithin());
    }
}
