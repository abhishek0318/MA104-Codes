/*
 *  Abhishek Sharma
 *  16123002
 *  MA104 - Assignment 4
 */

import java.util.Scanner;
public class Question2 {
    static boolean palindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        String string = reader.nextLine();
        if (palindrome(string)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
