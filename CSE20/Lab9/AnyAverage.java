import java.util.Scanner;

public class AnyAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);		
		System.out.print("Please enter the max number:");
		int max = input.nextInt();
		
		int sum = 0;
		for (int i = 0; i <= max; i++) {
		System.out.println("Number " + i);
		sum = (i + sum);
		}
		
		System.out.println("Average of all is " + (int)(sum/(max+1)));
	}
}
