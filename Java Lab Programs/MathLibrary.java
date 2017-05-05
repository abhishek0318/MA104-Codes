import java.lang.Math;
import java.util.Scanner;

class MathLibrary
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    reader.close();
    int Power = (int) Math.pow(a, b);
    System.out.println("A raised to power B: " + Power + ".");
  }
}
