import java.util.Scanner;
public class DataAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the sample size: ");
			int s1 = input.nextInt();
			int [] arr1= new int [s1], arr2= new int [s1], arr3= new int [s1], arr4 = new int [s1];
			int avg1 =0, avg2 = 0, avg3 = 0, avg4 = 0;
			for(int i= 0; i < 4; i++){System.out.println("Enter numbers for Enclosure " + i);
			if(i==0){int C = 0, kelvinisagoodproffessor = 0, N;
			for (int t=0; t<s1; t++){
				System.out.print("Enter sample #" + t + ":");C++;N = input.nextInt();
				if (N > 0){kelvinisagoodproffessor = kelvinisagoodproffessor + N;arr1[t] = N;}
				else {arr1[t] = 0;C--;}}
			if (C==0)C = 1;avg1 = kelvinisagoodproffessor/ C;}
			if(i==1){int Ilovemymama = 0, total1 = 0, num1;
			for(int e=0; e<s1; e++){
				System.out.print("Enter sample #" + e + ": ");Ilovemymama++;num1 = input.nextInt();
				if (num1 > 0){total1 = total1 + num1;arr2[e] = num1;}
				else {arr2[e] = 0;Ilovemymama--;}}
			if (Ilovemymama==0)Ilovemymama = 1;avg2 = total1 / Ilovemymama;
			}if(i==2){int katyperryishot = 0, total2 = 0, num2;
			for(int j=0; j<s1; j++){
				System.out.print("Enter sample #" + j + ": ");katyperryishot++;num2 = input.nextInt();
				if (num2 > 0){total2 = total2 + num2;arr3[j] = num2;} 
				else {arr3[j] = 0;katyperryishot--;}}
			if (katyperryishot==0)katyperryishot = 1;avg3 = total2 / katyperryishot;}if(i==3){
				int count3 = 0, total3 = 0, num3;
				for(int b=0; b<s1; b++){
					System.out.print("Enter sample #" + b + ": ");	
					count3++;num3 = input.nextInt();
					if (num3 > 0){total3 = total3 + num3;arr4[b] = num3;}else {arr4[b] = 0;count3--;}}
				if (count3==0)count3 = 1;avg4 = total3 / count3;}
			}System.out.println("\n\tSample\t\tNone\t\tBird\t\tBat\t\tBoth");
			for(int r=0;r < s1; r++)
				System.out.println("\t" + r + "\t\t" + arr1[r] + "\t\t" + arr2 [r] + "\t\t" + arr3[r] + "\t\t" + arr4 [r]);
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Average: \t\t" + avg1 + "\t\t" + avg2 + "\t\t" + avg3 + "\t\t" + avg4);
			System.out.println("");
			if(avg2 < avg3)System.out.print("** Birds ate more! **");
			if(avg2 > avg3)System.out.print("** Bats ate more! **"); 
			if(avg2 == avg3)System.out.print("** Birds and Bats ate the same! **");
			}
	}


