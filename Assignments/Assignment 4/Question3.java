/*
 *  Abhishek Sharma
 *  16123002
 *  MA104 - Assignment 4
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i = i + 2) {
            if (i == size - 1)
                System.out.println(array[i]);
            else if (array[i] != array[i + 1]) {
                System.out.println(array[i]);
                break;
            }
        }
    }
}
