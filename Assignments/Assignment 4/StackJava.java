/*
 *  Abhishek Sharma
 *  16123002
 *  MA104 - Assignment 4
 */

import java.util.Objects;
import java.util.Scanner;

class Stack {
    private int index;
    private int size;
    int arr[];

    Stack(int s) { // Stack Constructor with user defined size
        index = -1;
        size = s;
        arr = new int[size];
    }

    void push(int val) { // To push elements in Stack
        if (index + 1 < size) {
            arr[++index] = val;
        }
        else {
            System.out.print("\nStack is Full!\n");
        }
    }

    int pop() { // To pop elements from Stack
        if (index != -1) {
            return arr[index--];
        }
        else return 0;
    }

    int top() { // Returns the top element in Stack
        if (index != -1) {
            return arr[index];
        }
        else return 0;
    }
}

public class StackJava {
    public static void main(String args[]) {
        int Q, S, N;

        Scanner scanner = new Scanner(System.in);

        S = scanner.nextInt();
        Stack stack = new Stack(S);

        Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String option = scanner.next();
            // System.out.println(option);
            if (option.equals("A")) {
                N = scanner.nextInt();
                stack.push(N);
            }
            else if (option.equals("B")) {
                stack.pop();
            }
            else if (option.equals("T")) {
                System.out.println(stack.top());
            }
        }
    }
}

/*
--------------------------
Input:
S- Stack Size
Q- Number of Queries
A- Push B- Pop
T- Print Top element
N- Number to be pushed in stack
--------------------------
Input Format:
First line contains S and Q, the stack size and number of queries respectively which
follows Q lines of input containing queries,
A N ->To push N in stack
B   ->To pop stack once
T   ->To print top element of stack
--------------------------
Input:
5 8
A 10
A 20
T
B
A 30
A 40
B
T
--------------------------
Output:
20
30

*/
