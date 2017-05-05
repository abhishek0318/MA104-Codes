import java.util.Scanner;

class Swap
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    reader.close();
    System.out.println("a: " + a + " b: " + b);
    System.out.println("Swapping...");
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a: " + a + " b: " + b);
  }
}
