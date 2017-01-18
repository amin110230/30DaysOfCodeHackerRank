package day00ToDay11;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6LetsReview {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String even = "", odd = "";
        int T = scan.nextInt();
        String s[] = new String[T];
        for (int i = 0; i < T; i++) {
            s[i] = scan.next();
            int length = s[i].length();
            char c[] = s[i].toCharArray();
            for (int j = 0; j < length; j++) {
                if (j % 2 == 0) {
                    even += c[j];
                } else {
                    odd += c[j];
                }
            }
            System.out.println(even + " " + odd);
            even = "";
            odd = "";
        }
        scan.close();
    }
}
