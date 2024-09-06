package edu.ithaca.dragon.shapes;
public class Triangle {
    private double sideLength;

    /*
 * This Triangle is only an equalateral triangle with the stated side length. 
 * It could be adjusted to a trangle with more complex sides however this seemed like the simplest version of this.
 */
    public Triangle(double sideLength_){
        sideLength = sideLength_;
    }
    public double calcArea(){
        return (Math.sqrt(3)*sideLength)/2;
    }

}
