package Day26NestedLogic;

import java.io.*;
import java.util.*;

class BookReturnDate {

    public int day;
    public int month;
    public int year;

    BookReturnDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BookReturnDate actualDate = new BookReturnDate(in.nextInt(), in.nextInt(), in.nextInt());
        BookReturnDate expectedDate = new BookReturnDate(in.nextInt(), in.nextInt(), in.nextInt());
        in.close();

        int fine = 0;
        if (expectedDate.year == actualDate.year) {
            if (expectedDate.month < actualDate.month) {
                fine = (actualDate.month - expectedDate.month) * 500;
            } else if ((expectedDate.month == actualDate.month) && (expectedDate.day < actualDate.day)) {
                fine = (actualDate.day - expectedDate.day) * 15;
            }
        } else if (expectedDate.year < actualDate.year) {
            fine = 10000;
        }
        System.out.println(fine);
    }
}
