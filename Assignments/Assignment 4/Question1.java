/*
 *  Abhishek Sharma
 *  16123002
 *  MA104 - Assignment 4
 */

import java.util.Scanner;

public class Question1 {
    static boolean powerOfTwo(int number) {
        return ((number - 1) & (number)) == 0;
    }
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        if (powerOfTwo(number)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
