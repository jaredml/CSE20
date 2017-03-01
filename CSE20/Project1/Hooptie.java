import java.util.Scanner;

public class Hooptie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Available cars: 1 for Econobox, 2 for Whip, 3 for Junker");
		System.out.print("Please choose the rental car: ");
		int car = input.nextInt();
		System.out.print("Please enter the number of rental days: ");
		int rentalDays = input.nextInt();
		System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
		int executivePackage = input.nextInt();
		System.out.print("Repeat customer?:1 for yes, 0 for no: ");
		int repeatCustomer = input.nextInt();
		int result = 0;
		int execPackage = 0;
		int returnCustomer = 0;
		if (car == 1) {
			System.out.println(rentalDays + " days for a Econobox @ $35 per day: $" + (int)((rentalDays) * (35)));
			result = (int)(rentalDays * 35);
		} 
		else if (car == 2) {		
			System.out.println(rentalDays + " days for a Whip @ $65 per day: $" + (int)((rentalDays) * (65)));
			result = (int)(rentalDays * 65);
		} 
		else if (car == 3) {
			System.out.println(rentalDays + " days for a Junker @ $20 per day: $" + (int)((rentalDays) * (20)));
			result = (int)(rentalDays * 20);
		}
		if (executivePackage == 1){
			System.out.println("Platinum Executive Package: + $" + (int)((result)*(.1)));
			execPackage = (int)((result)*(.1));
		}
		if (repeatCustomer == 1){
			System.out.println("Return Customer Discount: - $" + (int)((result)/(5)));
			returnCustomer = (int)((result)/(5));
		}
		System.out.println("Total Estimate for Rental: $" + (int)(result + execPackage - returnCustomer));
	}
}