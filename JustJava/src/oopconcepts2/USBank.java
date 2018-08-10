package oopconcepts2;

public interface USBank {
	
	int min_bal = 100; // this variables can't be changed !!!
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	// only method declaration
	// no method body --> only method prototype
	// in Interface we can create the variables, vars are by default is static in nature
	// vars value will not be changed, its final/constant in nature 
	// no static methods in Interface 
	// no main method in Interface
	// we can not create the object of Interface
	// Interface is abstract in nature 
	

}
