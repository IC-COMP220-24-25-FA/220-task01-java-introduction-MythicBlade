package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius <= 0){
            throw new IllegalArgumentException("invalid radius");
        }
        
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double area = Math.PI * (this.radius * this.radius);
        return area;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius = this.radius * 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double answer = 2 * this.radius;
        return answer;
    }
}
 