import java.util.Scanner;


public class interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//This program will interview someone by asking them five questions
		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		String yes;
		System.out.print("This program will ask you 5 questions as a part of an interveiw");
		System.out.println(" are you ready?");
		yes = input.nextLine();
		
		String name;
		System.out.println("well then let's get started. What is your name?");
		name = input.nextLine();
		System.out.println("Hello "+ name);
		
		String major;
		System.out.println("What is your major?");
		major = input.nextLine();
		System.out.println("their major is cse");
		
		String from;
		System.out.println("Where are you from?");
		from = input.nextLine();
		System.out.println("oh you are from " + from);
		System.out.println("They are from Long Beach");
		
		String food;
		System.out.println("What is your favorite food?");
		food = input.nextLine();
		System.out.println("their favorite food is pizza");
		
		int number = 0;
		System.out.println("How old are you?");
		number = input.nextInt();
		System.out.println("They are 18 years old");

	}

}
