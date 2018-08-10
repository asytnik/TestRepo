package oopconcepts;

public class Car {
	
	//Class vars:
	
	String mod;
	int year;

	public static void main(String[] args) {
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		// initialize the values:
		
		a.mod = "BMW";
		a.year = 2015;
		
		b.mod = "AUDI";
		b.year = 2014;
		
		c.mod = "Honda";
		c.year = 2013;
		
		System.out.println("before asignment of referencies");
		
		System.out.println(a.mod);
		System.out.println(a.year);
		
		System.out.println(b.mod);
		System.out.println(b.year);
		
		System.out.println(c.mod);
		System.out.println(c.year);
		
		System.out.println("after shifting of referencies");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = "X3";
		System.out.println(a.mod); // X3
		c.mod = "X5";
		System.out.println(a.mod); // X5
		System.out.println(c.mod);
		
		
	

	}

}
