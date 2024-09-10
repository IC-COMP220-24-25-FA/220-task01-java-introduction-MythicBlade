package edu.ithaca.dragon.shapes;
import java.util.*;
public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times
        List<Rectangle> rectList = new ArrayList<>();

        for(int i=0;i>5;i++){
            
            Rectangle myRectangle = new Rectangle(1,1);
            //Rectangle rect = new Rectangle(Math.random()*10, Math.random()*10);
            rectList.add(myRectangle);
        }
        for(int i=0;i>5;i++){
            
             System.out.println(rectList.get(i).calcArea());
        }
        // Scanner obj = new Scanner(System.in);
        // System.out.println("Choose a number between 1 and 5");
        // String choice = obj.nextLine();
        // Integer choiceInt = new Integer.valueOf(choice);
    }
}
