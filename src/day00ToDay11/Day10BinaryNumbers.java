package day00ToDay11;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day10BinaryNumbers {

 /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = 0, num = 0;

        String b = Integer.toString(n, 2);
        char[] c = b.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '1') {
                num++;
            } else {
                num = 0;
            }
            if (m < num) {
                m = num;
            }
        }
        System.out.println(m);
    }
*/public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int rem=0,s=0,t=0;


    while(n>0)
        {
        rem=n%2;
        n=n/2;
        if(rem==1)
         {   s++;
           if(s>=t)

            t=s;

        }
        else{

            s=0;
        }   
    }

    System.out.println(t);
}
}
