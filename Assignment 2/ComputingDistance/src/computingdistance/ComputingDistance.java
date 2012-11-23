/*
 * A program to compute the distance between two points
 */

package computingdistance;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ComputingDistance 

{
    public static void main(String[] args)
            
    {
        int pointxa, pointxb, pointya, pointyb;
        double distance, cost;
        Scanner point = new Scanner(System.in);
        System.out.print("Please enter point x1:");
        pointxa = point.nextInt();
        System.out.print("Please enter point y1:");
        pointya = point.nextInt();
        System.out.print("Please enter point x2:");
        pointxb = point.nextInt();
        System.out.print("Please enter point y2:");
        pointyb = point.nextInt();
        distance = Math.sqrt((Math.pow((pointxa - pointxb), 2))
                            + Math.pow((pointya - pointyb), 2)); 
        DecimalFormat fmt = new DecimalFormat ("0.###");
        cost = distance * 0.43;
        System.out.println("The distance between the points (" + pointxa + ", " 
                + pointya + ") and (" + pointxb + ", " + pointyb + ") is " + 
                fmt.format(distance) + " and the total travel cost is $" + 
                fmt.format(cost));
        
    }
}
