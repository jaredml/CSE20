import java.util.Scanner;


public class PosAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0, max = 0, count = 0, a = 0;
		do{
		System.out.println("Enter " + count + " Number ");
		a =input.nextInt();
		if(a > 0) {sum += a; count += 1;}
		}while(a>0);
		
		System.out.println("Average of all is " + (int)(sum/(max+1)));
	}
}