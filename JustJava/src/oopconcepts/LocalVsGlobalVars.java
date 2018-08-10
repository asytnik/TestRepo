package oopconcepts;

public class LocalVsGlobalVars {
	
	// Global vars == Class variables
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i = 10; // local var for main() method
		
		System.out.println(i);
		
		LocalVsGlobalVars obj = new LocalVsGlobalVars();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
				
	}
	
	public void sum(){
		
		int i = 15; // local var for sum() method
		int j = 20;
		
				
	}

}
