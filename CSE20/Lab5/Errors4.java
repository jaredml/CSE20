 
import java.io.PrintStream;
import java.util.Scanner;




public class Errors4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter two ints and we print out sum as an int.");
    
    System.out.print("Enter the first number: ");
    int n1 = keyboard.nextInt();
    
    System.out.print("Enter the second number: ");
    int n2 = keyboard.nextShort();
    
    System.out.println("The sum of the numbers is " + (n1 + n2));
  } 
} 