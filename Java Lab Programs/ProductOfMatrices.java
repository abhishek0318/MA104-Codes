import java.util.Scanner;

class ProductOfMatrices
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter order of matrices (r, c): ");
    int n1 = reader.nextInt(), m1 = reader.nextInt();
    int matrix1[][];
    matrix1 = new int[n1][m1];
    System.out.println("Enter elements of matrix 1: ");
    for (int i = 0; i < n1; i++)
    {
      for (int j = 0; j < m1; j++)
      {
        matrix1[i][j] = reader.nextInt();
      }
    }

    System.out.println("Enter order of matrices (r, c): ");
    int n2 = reader.nextInt(), m2 = reader.nextInt();
    int matrix2[][];
    matrix2 = new int[n2][m2];
    System.out.println("Enter elements of matrix 2: ");
    for (int i = 0; i < n2; i++)
    {
      for (int j = 0; j < m2; j++)
      {
        matrix2[i][j] = reader.nextInt();
      }
    }
    reader.close();
    if (m1 != n2) {
      System.out.println("Matrices cannot be multiplied.");
      return;
    }
    System.out.println("Product of matrices: ");
    for (int i = 0; i < n1; i++)
    {
      for (int j = 0; j < m2; j++)
      {
        int sum = 0;
        for (int k = 0; k < n2; k++) {
          sum += matrix1[i][k] * matrix2[k][j];
        }
        System.out.print(sum + " ");
      }
      System.out.println();
    }
  }
}
