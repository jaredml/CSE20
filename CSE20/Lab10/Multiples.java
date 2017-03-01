import java.util.Scanner;
public class Multiples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int i = 0, base = 0, max = 0; 
		
		System.out.println("Please enter the max number: ");
		max = input.nextInt();
		System.out.println("Enter the Base: ");
		base = input.nextInt();
		
		for(i = base; i <= max; i += base){	
		System.out.println("Number is " + i);
	}
}
}