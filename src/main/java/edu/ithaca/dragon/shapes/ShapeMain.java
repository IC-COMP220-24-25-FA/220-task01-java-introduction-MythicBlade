package edu.ithaca.dragon.shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

public class ShapeMain {

    public static void main(String[] args) {
        // Make a list of 5 randomly-sized rectangles and print their area and the
        // largest line that can be drawn through them
        // Allow the user to choose one, double the size of that one, and print them all
        // again
        // Use a loop to repeat the process 5 times
        List<Rectangle> rectList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            rectList.add(new Rectangle(Math.random() * 10, Math.random() * 10));
        }
        for (int i = 0; i < 5; i++) {

            System.out.println(i);
            System.out.println("Area : " + rectList.get(i).calcArea());
            System.out.println("LongestLine: " + rectList.get(i).longestLineWithin());
        }
        Scanner obj = new Scanner(System.in);

        for (int n = 0; n < 5; n++) {
            System.out.println("Choose a number between 1 and 5");
            String choice = obj.nextLine();
            int index = Integer.parseInt(choice) - 1;

            while (index > 5 | index < 0) {
                System.out.println("Sorry this is an invalid number");
                System.out.println("Choose a number between 1 and 5");
                choice = obj.nextLine();
                index = Integer.parseInt(choice) - 1;

            }
            rectList.get(index).doubleSize();
            for (int i = 0; i < 5; i++) {

                System.out.println(i);
                System.out.println(rectList.get(i).calcArea());
                System.out.println(rectList.get(i).longestLineWithin());
            }

        }
    }
}