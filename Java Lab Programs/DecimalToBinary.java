import java.util.Scanner;

public class DecimalToBinary {
	public static String convertDecimalToBinary(int decimal) {
		String binary = "";
		while (decimal != 0) {
			binary = String.valueOf(decimal % 2) + binary;
			decimal /= 2;
		}
		return binary;
	}
	public static void main(String args[]) {
		System.out.print("Enter the number: ");
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		reader.close();
		System.out.print("The binary representation of the number is: ");
		System.out.println(convertDecimalToBinary(number));
	}
}
