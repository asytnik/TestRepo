package fibonacciSeries;

import java.util.Scanner;

public class FibonacciTelusko {

	/*
	 * print --> 1 1 2 3 5 8 13 21 34 ... n
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k, a = 1, b = 1;

		Scanner sc = new Scanner(System.in);

		k = 0;
		System.out.println("Enter any digit values : ");

		int n = sc.nextInt();

		System.out.print("1 1 ");

		while (k <= n - a) {

			k = a + b;

			/*
			 also, we can add 'if()' statement:
			
			 if (k >= n) 
				 break;
			*/
			 
			System.out.print(k + " ");

			a = b;
			b = k;

		}

	}

}
