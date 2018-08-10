package oopconcepts;

public class StaticAndNonStaticConcepts {
	
	// Global vars Class level -->
	// scope of global variables will be available across all functions/methods with same conditions 
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable

	public static void main(String[] args) {
		
		// how to call static methods and variables
		//1. directly
		sum();
		//2. using class name
		StaticAndNonStaticConcepts.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcepts.age);
				
		// how to call non-static method and variables
	    //1. using obj approach (create object from class)
		StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();
		obj.sendMail();
		System.out.println(obj.name);
		System.out.println(age);
		
		// can I access to static methods by using object reference? YES
		obj.sum(); // warning will be given -- bad practice !!!


	}
	
	public void sendMail(){ // non static method
		System.out.println("SendMail method");
		
	}
	
	public static void sum(){ // static method
		System.out.println("sum method");
		
		
	}
	
	
}
