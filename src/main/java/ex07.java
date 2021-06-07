/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt();
        final double convFact = 0.09290304;
        int area = length*width;
        double metricArea = area*convFact;
        String output = String.format("""
                        You entered the dimensions of %d feet by %d feet\s
                        The area is\s
                        %d square feet\s
                        %.3f square meters"""
                                        , length, width, area, metricArea);
        System.out.println(output);

    }
}
