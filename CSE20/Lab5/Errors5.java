import java.io.PrintStream;
import java.util.Scanner;




public class Errors5
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("What is your weight in kg? ");
    int weight = keyboard.nextInt();
    
    System.out.print("What is your age? ");
    int age = keyboard.nextInt();
    System.out.println("Wow you are " + (int)(age * 6.9D) + " in dog years.");
    System.out.println("Your weight in lbs is " + (int)(weight * 2.2D) + " with no decimal point");
  } 
} 
