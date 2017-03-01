import java.util.Scanner;

public class EvenNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the max number:");

		int max = input.nextInt();

		for (int i = 0; i <= max; i++,i++) {
		System.out.println("Number " + i);
		}
	}
}
