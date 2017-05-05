import java.util.Scanner;

class MirrorImage
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter order of matrix (r, c): ");
    int n = reader.nextInt(), m = reader.nextInt();
    int matrix[][];
    matrix = new int[n][m];
    System.out.println("Enter elements of matrix: ");
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        matrix[i][j] = reader.nextInt();
      }
    }
    reader.close();

    System.out.println("Mirror Image of matrix: ");
    for (int i = 0; i < m / 2; i++)
    {
    	for (int j = 0; j < n; j++)
    	{
    		int t = matrix[j][i];
    		matrix[j][i] = matrix[j][m - i - 1];
    		matrix[j][m - i - 1] = t;
    	}
    }
    
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
