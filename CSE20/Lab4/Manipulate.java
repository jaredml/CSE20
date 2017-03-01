import java.util.Scanner;
public class Manipulate{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	int n1, n2;
	short n3, n4; 
	float n5, n6;
	double n7, n8;
	
	System.out.println("Please enter an integer:");
	n1 = input.nextInt();
	System.out.println("Please enter an integer:");
	n2 = input.nextInt();
	System.out.println("Output is " + (int)(n1+n2));
	System.out.println("Output is " + (int)(n1-n2));
	System.out.println("Output is " + (int)(n1*n2));
	System.out.println("Output is " + (int)(n1/n2));
	
	System.out.println("please enter a short:");
	n3 = input.nextShort();
	System.out.println("pleas enter another short:");
	n4 = input.nextShort();
	System.out.print("Output is " + (short)(n3+n4));
	System.out.println("Output is " + (short)(n3-n4));
	System.out.println("Output is " + (short)(n3*n4));
	System.out.println("Output is " + (short)(n3/n4));
	
	System.out.println("please enter a float:");
	n5 = input.nextFloat();
	System.out.println("please enter another float:");
	n6 = input.nextFloat();
	System.out.print("Output is " + (float)(n5+n6));
	System.out.println("Output is " + (float)(n5-n6));
	System.out.println("Output is " + (float)(n5*n6));
	System.out.println("Output is " + (float)(n5/n6));
	
	System.out.println("Please enter a double:");
	n7 = input.nextDouble();
	System.out.println("Please enter another double:");
	n8 = input.nextDouble();
	System.out.print("Output is " + (double)(n7+n8));
	System.out.println("Output is " + (double)(n7-n8));
	System.out.println("Output is " + (double)(n7*n8));
	System.out.println("Output is " + (double)(n7/n8));
	
	}
}
