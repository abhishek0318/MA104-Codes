import java.util.Scanner;

class Rotation1DArray
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
    int k;
    System.out.println("Enter the number of rotations: ");
    k = reader.nextInt();
    
    System.out.println("The rotated array is: ");
    for (int i = 0; i < n; i++)
    {
      System.out.print(arr[(i - k + n) % n] + " ");
    }
  }
}
