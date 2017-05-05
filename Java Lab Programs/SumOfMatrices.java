import java.util.Scanner;

class SumOfMatrices
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter order of matrices (r, c): ");
    int n = reader.nextInt(), m = reader.nextInt();
    int m1[][];
    m1 = new int[n][m];
    System.out.println("Enter elements of matrix 1: ");
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        m1[i][j] = reader.nextInt();
      }
    }

    int m2[][];
    m2 = new int[n][m];
    System.out.println("Enter elements of matrix 2: ");
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        m2[i][j] = reader.nextInt();
      }
    }
    reader.close();
    System.out.println("Sum of matrices: ");
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        System.out.print((m1[i][j] + m2[i][j]) + " ");
      }
      System.out.println();
    }
  }
}
