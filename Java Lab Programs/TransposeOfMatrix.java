import java.util.Scanner;

class TransposeOfMatrix
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter order of matrix (n, n): ");
    int n = reader.nextInt();
    int matrix[][];
    matrix = new int[n][n];
    System.out.println("Enter elements of matrix: ");
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        matrix[i][j] = reader.nextInt();
      }
    }
    reader.close();

    System.out.println("Transpose of matrix: ");
    for (int i = 0; i < n; i++)
    {
      for (int j = i + 1; j < n; j++)
      {
    	  matrix[j][i] = matrix[i][j] ^ matrix[j][i];
    	  matrix[i][j] = matrix[i][j] ^ matrix[j][i];  
    	  matrix[j][i] = matrix[i][j] ^ matrix[j][i];  
      }
    }
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
    	  System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
