import java.util.Scanner;

class Calculator
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    reader.close();
    int sum = a + b, product = a * b, remainder = a % b;
    float division = ((float) a) / b;
    System.out.println("Sum: " + sum + "\nProduct: " + product + "\nDivision: " + division + "\nRemainder: " + remainder);
  }
}
