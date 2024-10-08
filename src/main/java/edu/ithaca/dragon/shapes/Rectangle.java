package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("invalid dimension");
        }
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
       return (this.length * this.width);
    }

    public void doubleSize(){
        this.length = this.length * 2;
        this.width = this.width * 2;
    }

    public double longestLineWithin(){
        return Math.sqrt((length*length)+(width*width));
    }
    
}
