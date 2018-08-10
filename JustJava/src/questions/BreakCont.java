package questions;

public class BreakCont {

	public void go(){
		
		System.out.println("Before");
		
		// break;
		
		// continue;
		
		System.out.println("After");

	}
	
	public static void main(String[] args) {
		
		/*BreakCont b = new BreakCont();
		b.go();*/
		
		for(int i=0; i<10; i++){
			
			if(i==5)
				break;
			System.out.println(i);
			
		}
		

	}

}
