import java.util.Scanner;
public class AnyAverageArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("Please enter the max number:");
		int max = input.nextInt();
		
		int []arr = new int [max];
		
		// For-loop to calculate 
		for (int i = 0;i < max;i++){
		System.out.print("Please enter the " + i + " number: ");
		arr[i] = input.nextInt();
		sum += arr[i];
		}
		System.out.println("The numbers being averaged: ");
		for(int i = 0; i< max; i++){
			System.out.print(arr[i] + " ");
			if(((i+1)%5) == 0)
		System.out.println(" ");
		}
System.out.println(" ");
		
System.out.println("Average is: " + (sum/max));
	
	}

}
