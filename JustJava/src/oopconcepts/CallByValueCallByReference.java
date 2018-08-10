package oopconcepts;

public class CallByValueCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueCallByReference obj = new CallByValueCallByReference();
		int x = 10;
		int y = 20;
		int r = obj.testSum(x, y); // call by value OR pass by value
		System.out.println(r);
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		// after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		

	}
	
	public int testSum(int a, int b){
		a = 30;
		b = 40;
		int c = a+b;
		return c;
		
	}
	
	// call by reference --> "t" is reference variable, same like "obj"
	public void swap(CallByValueCallByReference t){
		
		int temp;
		temp = t.p; // temp=50
		t.p = t.q;  // t.p=60
		t.q = temp; // t.q=50
	
	}

}
