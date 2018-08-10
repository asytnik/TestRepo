package questions;

public class Quest {

	// static Quest t;

	public static void main(String[] args) {

		Quest t = new Quest();

		// t.getDisplay("Show", 120);

		getDisplay("disney", 500);

		System.out.println(t);

		Calculator calc = new Calculator();

		int sub = calc.getSub(10, 2);

		System.out.println(sub);

		double db = Math.random();
		
		double db1 = Math.random() * 100;
		
		// type casting -->

		int db2 = (int)(Math.random() * 100);
		
		double db3 = (int)(Math.random() * 100);

		System.out.println(db);
		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);
		
	}

	public static void getDisplay(String s, int k) {

		System.out.println();

	}

}
