package simplepatterns;

/*
 * Pattern for printing:
 * 
 * 1
 * 2 2
 * 3 3 3 
 * 4 4 4 4 
 * 5 5 5 5 5
 * 
 */

public class Pattern_12345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;

		for (i = 1; i <= 5; i++) { // rows

			for (j = 1; j <= i; j++) { // columns

				System.out.print(i + " ");

			}

			System.out.println("");

		}

	}

}
