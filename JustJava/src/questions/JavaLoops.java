package questions;

public class JavaLoops {

	public static void main(String[] args) {

		// while
		int i = 1;

		while (i <= 10) {

			System.out.println(i);
			i++;
		}

		System.out.println("**** doWhile ****");

		// this loop execute at least one time in any case !

		int k = 1;

		do {

			System.out.println(k);
			k++;

		} while (k <= 10);

		System.out.println(k);

		System.out.println("**** forLoop ****");

		for (int j = 1; j <= 10; j++) {

			System.out.println(j);
		}

		System.out.println("forLoop with same result");

		int l = 1;

		for (; l <= 10;) {

			System.out.println(l);
			l++;
		}

	}

}
