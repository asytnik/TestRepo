package simplepatterns;

/*
 * Pattern for printing:
 * 
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 
 */

public class Pattern_0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;

		for (i = 1; i <= 5; i++) { // rows

			for (j = 1; j <= i; j++) { // columns

				if ((i + j) % 2 == 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");

			}
			
			System.out.println("");

		}

	}

}
