package questions;

public class IFElseCondition {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 20);

		if (num > 10)
			System.out.println(num + " More than 10");
		else if (num <= 10 && num >= 5)
			System.out.println(num + " Between 5 and 10");
		else
			System.out.println(num + " Less than 10");
	}

}
