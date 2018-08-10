package simplepatterns;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main(String[] args) {
		
		OddOrEven ooe = new OddOrEven();
		
		System.out.println("Input value : ");
		
		ooe.getDigitDetermination();
		
	}
	
	public void getDigitDetermination(){
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if(i%2 ==0)
			System.out.println("Digit is Even");
		else
			System.out.println("Digit is Odd");
	}
	
	

}
