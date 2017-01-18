package Day29BitwiseAND;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (((k - 1) | k) > n && k % 2 == 0) {
                System.out.println(k - 2);
            } else {
                System.out.println(k - 1);
            }
        }
    }
}
