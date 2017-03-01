import java.util.Scanner;


public class SumSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int max =0 ,sum = 0;
		System.out.print("Please enter the max number:");
		max = input.nextInt();
		
		for (int i = 1; i <= max; i++) {
		System.out.println("Numer " + i + " Squared " + (i*i));
		sum = ((i*i) + sum);
		}
		System.out.println("Sum of squares is " + sum);
	}
}
