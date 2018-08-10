package concepts;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		// ++
		// --
		
		int i = 1;
		int j = i++; // post increment
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("****************");
		
		int a = 1;
		int b = ++a; // pre increment
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("****************");
		
		int k = 5;
		int l = k--; // pre decrement
		
		System.out.println(k);
		System.out.println(l);
		
		System.out.println("****************");
		
		int d = 5;
		int e = --d; // post increment
		
		System.out.println(d);
		System.out.println(e);

	}

}
