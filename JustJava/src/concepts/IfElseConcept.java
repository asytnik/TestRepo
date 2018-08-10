package concepts;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		if (a<b){
			
			System.out.println("b greatest than a");
		}else{
			
			System.out.println("a greatest than b");
		}
		
		int c = 50;
		int d = 40;
		
		if (c==d){
			
			System.out.println("c is equal d");
		}else{
			
			System.out.println("c is not equal d");
		}
		
		// write a logic to find out greatest number
		int d1 = 500;
		int d2 = 300;
		int d3 = 800;
		
		if (d1>d2 & d1>d3){ // true & false = false
			
			System.out.println("d1 is greatest");
		
		}else if (d2>d3){
			
			System.out.println("d2 is greatest");
			
		}else {
			
			System.out.println("d3 is greatest");
		}
	}
}
