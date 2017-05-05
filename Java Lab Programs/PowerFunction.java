import java.util.Scanner;

class PowerFunction
{
  /*
  public static int power(int x, int y)
  {
    int answer = 1;
    for (int i = 0; i < y; i++)
    {
      answer = answer * x;
    }
    return answer;
  }
  */

  public static int power(int x, int y)
  {
    if (y == 0) return 1;
    else return x * power(x, y - 1);
  }

  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    reader.close();
    int Power = power(a, b);
    System.out.println("A raised to power B: " + Power + ".");
  }
}
