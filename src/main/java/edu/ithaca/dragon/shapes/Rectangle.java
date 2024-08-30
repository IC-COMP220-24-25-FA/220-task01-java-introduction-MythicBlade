package edu.ithaca.dragon.shapes;

public class Rectangle {
    

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("invalid dimension");
        }
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
    
}
