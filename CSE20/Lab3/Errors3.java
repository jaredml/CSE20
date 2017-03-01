import java.util.Scanner;

public class Errors3 {

	public static void main(String[] args) {
// Scanner input = new SAcanner System.in;		
		Scanner input = new Scanner(System.in);
//Int numerator;
		int numerator = 0;
//integer denominator;
		int denominator = 0;
//System.println("This program divides two numbers.");
		System.out.println("This program divides two numbers.");
//System.print("enter the numerator: ");
		System.out.print("Enter the numerator: ");
//numerator = kbd.nextInt();
		numerator = input.nextInt();
		System.out.print("Enter the denominator: ");
//denomintaor = kbd.nextInt();
		denominator = input.nextInt();
//system.out.print(numerator);		
		System.out.print(numerator);
		System.out.print("/");
//system.out.Print(denominator);		
		System.out.print(denominator);
		System.out.print(" = ");
//System.out.Println((double) numerator/denominator);
		System.out.println((double) numerator/denominator);
	}
}