package day00ToDay11;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5Loops {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i<=10; i++){
            int mul = i * N;
            System.out.println(N + " * " + i +" = "+ mul);
        }
    }
    
}
