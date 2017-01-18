package day00ToDay11;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author Ameen
 */
public class Day1DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
     /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        /* Read and save an integer, double, and String to your variables.*/
        i2 = i + scan.nextInt();
        d2 = d + scan.nextDouble();
        scan.nextLine(); // returns everything after f until the beginning of the next line; because there are no characters there, it returns an empty String. You must understand what happens when you switch between reading a token (single word) of input and reading an entire line of input to successfully complete this challenge.
        s2 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i2);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+s2);
        scan.close();
    }
}
