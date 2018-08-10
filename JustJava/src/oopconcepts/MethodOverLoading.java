package oopconcepts;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(5,8);
				
	}
	
	// we can overload main method also !!!!
	
	public static void main(int t){
		
	}
	
    public static void main(int p, int q){
		
	}
	
	// you can't create one method inside other method
	// same way --> you can't create duplicate(copy) method with same arguments
	
	// method overloading --> when the method name is same with different arguments/parameters or data types within the same class
	
	public void sum(){ // input 0 param
		System.out.println("Sum method with Zero parameters");
	}

	public void sum(int i){ // input 1 param
		System.out.println("Sum method with One parameter");
		System.out.println(i);
		
		}
	
	public void sum(double d){ // input 1 param
		System.out.println("Sum method with One parameter");
		System.out.println(d);
		
		}
	
	public void sum(int l, int k){ // input 2 params
		System.out.println("Sum method with Two parameters");
		System.out.println(l+k);
		
		}
}
