package concepts;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		// array: to store similar data type values in array variables
		
		//1. int array
		// lowest bound/index = 0
		// upper bound/index = n-1 (where n is size of array)
		// one dimensional array
		
		// disadvantages of array: 
		// 1. size is fixed -- call static array --> to overcome of this problem -- we use Collections -- ArrayList, HashTable -- call dynamic array 
		// 2. can stores only similar data types of value --> to overcome of this problem -- we use Object array
			
		int i[] = new int[4];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4] = 50; --> ArrayIndexOutOfBoundsException
		
		System.out.println(i[1]);
		System.out.println(i[3]);
		
		// System.out.println(i[4]); // ArrayIndexOutOfBoundsException - value is not exist
		
		System.out.println(i.length); // print size/length of array
		
		// print all values of array - use for loop
		
		for ( int j=0; j<i.length; j++){
			
			System.out.println(i[j]);
			
		}			
			// double array
			
			double d[] = new double[3];
			
			d[0] = 12.33;
			d[1] = 13.44;
			d[2] = 14.55;
			
			// char 
			
			char c[] = new char[3];
			
			c[0] = 'g';
			c[1] = 2;
			c[2] = '$';
			
			// boolean
			
			boolean b[] = new boolean[2];
			
			b[0] = true;
			b[1] = false;
			
			// String
			
			String s[] = new String[3];
			
			s[0] ="bob";
			s[1] ="nick";
			s[2] ="rosa";
			
			System.out.println(s[2]);
			System.out.println(s.length);
			
			// Object array (Java class) -- is used to store different type of data values
			
			Object ob[] = new Object[6];
			
			ob[0] = "Tom";
			ob[1] = 25;
			ob[2] = 1500.99;
			ob[3] = "3/29/1990";
			ob[4] = 'm';
			ob[5] = "London";
			
			System.out.println(ob.length);
			
			for(int l=0; l<ob.length; l++){
				
				System.out.println(ob[l]);
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		



}
