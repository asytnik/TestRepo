package oopconcepts2;

public class HSBCBank implements USBank, BrazilBank {// we are achieving multiply inheritance
	
	// --"Is a relationship"--
		
	// if a Class is implementing any Interface, then its mandatory define/override all Interface methods 
	// these three methods implemented/overriding from USBank Interface
	public void credit(){
		System.out.println("HSBCBank --- credit");
	}
	
	public void debit(){
		System.out.println("HSBCBANK --- debit");
	}

	public void transferMoney(){
		System.out.println("HSBCBank --- transferMoney");
	}
	
	// these two methods are owns HSBCBank Class
	public void educationLoan(){
		System.out.println("HSBCBank --- edu loan");
	}
	
	public void carLoan(){
		System.out.println("HSBCBank --- car loan");
	}
	
	// this method implemented/overriding from BrazilBank Interface
	public void mutualFund(){
		System.out.println("HSBCBank -- mutual Fund");
	}
}
