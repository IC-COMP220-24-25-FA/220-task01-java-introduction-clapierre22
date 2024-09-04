package edu.ithaca.dragon.shapes;

public class Circle implements Shape{
    private double radius;
    private double piValue = 3.145;

    @Override
    public String toString(){
        return ("This is a Circle with a Radius of " + this.radius);
    }

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return this.piValue * (this.radius * this.radius);
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        double dRadius = 2 * (this.radius);
        this.radius = dRadius;
    }
    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return this.radius * 2;
    }
}
