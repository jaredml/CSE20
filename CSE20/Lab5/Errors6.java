import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);
		int n1,n2;

		System.out.println("Please enter the first number:");
		n1 = input.nextInt();

		System.out.println("Please enter the second number:");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);

		float n3, n4;

		System.out.println("Please enter the first number:");
		n3 = input.nextFloat();

		System.out.println("Please enter the second number:");
		n4 = input.nextFloat();

		float floatAvg;
		floatAvg = ((float)((n3+n4)/2));
		System.out.println("The average of the numbers is " + floatAvg);

		short n5, n6;

		System.out.println("Please enter the first number:");
		n5 = input.nextShort();

		System.out.println("Please enter the second number:");
		n6 = input.nextShort();

		short shortAvg;
		shortAvg = ((short)((n5+n6)/2));
		System.out.println("The average of the numbers is " + shortAvg);
	}

}
