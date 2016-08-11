import java.util.*;

public class inverseSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		if (in.hasNextInt()) {
			int n = in.nextInt();
			double guess = n / 2;
			double r = n / guess;
			while (Math.abs(guess - 0.5 * (guess + r)) > 0.01 * guess) {
				guess = 0.5 * (guess + r);
				System.out.println(guess);
				r = n / guess;
			}

			System.out.printf("The square root of %d is %.2f: ", n, 0.5 * (guess + r));

		}
		in.close();
	}

}
