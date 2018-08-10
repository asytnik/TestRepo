package concepts;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
			
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		h.put(3,"Tom");
		
		// Restrictions for definitely values
		
		Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
		h1.put(1,"Jhon");
		
		Hashtable<Integer,Integer> h2 = new Hashtable<Integer,Integer>();
		h2.put(2, 200);
		
		Hashtable<String,String> h3 = new Hashtable<String,String>();
		h3.put("D", "Dream");
							
		/*for(int i=0; i<h.size(); i++){
			
			System.out.println(h.get(i));
		}*/

}
}