import java.util.Scanner;

class SumOfArray
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter number of elements: ");
    int n = reader.nextInt();
    int arr[];
    arr = new int[n];
    System.out.println("Enter elements: ");
    for (int i = 0; i < n; i++)
    {
      arr[i] = reader.nextInt();
    }
    reader.close();
    int sum = 0;
    for(int x : arr) {
    	sum += x;
    }
    System.out.println("Sum: " + sum);
  }
}
