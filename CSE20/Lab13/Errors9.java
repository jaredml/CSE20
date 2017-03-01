
public class Errors9 {

	public static void main(String[] args) {
		double[] inp = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
		double sum = 0;
		
		for (int i = 1; i < inp.length; i++ ) {
			sum += ((inp[i] * inp[i]));
			System.out.println("Squared of index " + i + " is " + (inp[i] * inp[i]));
		}
		System.out.println("Sum of Squares is " + sum);
	}

}
