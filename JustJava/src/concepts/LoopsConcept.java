package concepts;

public class LoopsConcept {

	public static void main(String[] args) {
	
		//1. while loop:
		// disadvantage while loop: create infinity loop if you don't give incremental / decremental part
		
		int i = 100; // initialization 
		while(i>=0){ // or i=1; i<=10; i++ // conditional 
			System.out.println(i);
			i=i-2; // incremental / decremental 
		}
		
		System.out.println("=====================");
		
		//2. for loop:
					
		for(int k=3; k<=30; k=k+3){ // initialization; condition; incremental/decremental part 
			
			System.out.println(k);
		}
		
		System.out.println("********************");		
		
		for(int j=30; j>=-10; j--){ // initialization; condition; incremental/decremental part 
			
			System.out.println(j);
		}
		
		

	}

}
