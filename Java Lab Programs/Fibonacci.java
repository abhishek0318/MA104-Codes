import java.util.Scanner;

class Fibonacci
{
  /*
  // Using iteration
  public static int fibonacci(int n)
  {
    if (n <= 0) return 0;
    if (n == 1 || n == 2) return 1;
    int store[];
    store = new int[n];
    store[0] = 1;
    store[1] = 1;
    for (int i = 2; i < n; i++)
    {
      store[i] = store[i - 1] + store[i - 2];
    }
    return store[n - 1];
  }
  */

  // Using recursion
  public static int fibonacci(int n)
  {
    if (n <= 0) return 0;
    if (n == 1 || n == 2) return 1;
    else return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter which fibonacci number to display: ");
    int num = reader.nextInt();
    reader.close();
    System.out.println("The nth fibonacci number is: " + fibonacci(num) + ".");
  }
}
