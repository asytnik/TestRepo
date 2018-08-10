package concepts;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// we can add any type of values
		ArrayList ar = new ArrayList();
				    // array indexes
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add("Hello");//6
		ar.add(12.88);//7
		ar.add('M');//8
		ar.add(600);//9
		
		System.out.println(ar.size());
		
		ar.remove(9); // remove value by index 9
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		// print all values of array
		
		for(int i=0; i<ar.size(); i++){
			
			System.out.println(ar.get(i));
		}
		
		// Restricted ArrayList only for Integers or String etc.( generic and non-generic)
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("Tom"); // error --> not applicable String arguments 
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		// ar2.add(100); // error --> not applicable Integer arguments 
		

	}

}
