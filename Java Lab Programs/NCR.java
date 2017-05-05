import java.util.Scanner;

class NCR
{
  // Using iteration
  public static int nCr(int n, int r)
  {
    return factorial(n) / (factorial(n - r) * factorial(r));
  }

  // Using recursion
  public static int factorial(int n)
  {
    if (n < 0) return 0;
    if (n == 1) return 1;
    else return factorial(n - 1) * n;
  }

  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = reader.nextInt();
    System.out.println("Enter r: ");
    int r = reader.nextInt();
    reader.close();
    System.out.println("nCr: " + nCr(n, r) + ".");
  }
}
