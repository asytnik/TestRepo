package oopconcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		// data conversion
		String x ="200";
		System.out.println(x+20);
		
		// String to integer
		int y =Integer.parseInt(x);
		System.out.println(y+20);
		
		// String to double 
		String s = "12.33";
		System.out.println(s);
		
		double d = Double.parseDouble(s);
		System.out.println(d+10);
		
		// String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		// Integer to string
		int i = 100;
		System.out.println(i+500);
		
		String f = String.valueOf(i);
		System.out.println(f+500);
		
		
		String u = "100A";
		Integer.parseInt(u); // NOT work --> NumberFormatException --> For input string: "100A"
		
		
		

	}

}
