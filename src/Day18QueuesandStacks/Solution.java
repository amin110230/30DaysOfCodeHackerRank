package Day18QueuesandStacks;

import java.io.*;
import java.util.*;

public class Solution {

    // Write your code here.
    int ms = 100;
    int top = -1, start = -1, end = -1;
    char[] stack = new char[100];
    char qu[] = new char[100];
//    Stack<Character> stack = new Stack();
//    Queue<Character> queue = new LinkedList();

    public void pushCharacter(char c) {
        top++;
        stack[top] = c;
    }
//    void pushCharacter(char ch) {
//        stack.push(ch);
//    }

    public void enqueueCharacter(char c) {
        end++;
        qu[end] = c;
    }
//    void enqueueCharacter(char ch) {
//        queue.add(ch);
//    }

    public char popCharacter() {
        top--;
        return stack[top + 1];
    }
//    char popCharacter() {
//        return stack.pop();
//    }

    public char dequeueCharacter() {
        start++;
        return qu[start];
    }

//    char dequeueCharacter() {
//        return queue.remove();
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
