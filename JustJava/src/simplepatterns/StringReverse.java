package simplepatterns;

import java.util.Scanner;

public class StringReverse {

	// There are two ways do it:
	// 1. using own approach and customize logic
	// 2. using standard JAVA API

	static String original; // for store user input
	static String rev = ""; // store reversed value

	public static void main(String[] args) {

		usingCustomApproachForStringReverse();

		System.out.println("****************");

		usingStandardJavaAPI();

	}

	public static void usingCustomApproachForStringReverse() {
		// 1. create two string objects

		// take input word from user

		System.out.println("Enter String to reverse");

		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();

		int len = original.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + original.charAt(i);
		}

		// print both of String objects:
		System.out.println("First way --> Original string is: " + original);

		System.out.println("First way --> Reverse string is: " + rev);
	}

	public static void usingStandardJavaAPI() {

		// 2. For second way we need create object StringBuffer

		StringBuffer sb = new StringBuffer(original);

		rev = sb.reverse().toString();

		// print both of String objects:
		System.out.println("Second way --> Original string is: " + original);

		System.out.println("Second way --> Reverse string is: " + rev);

	}

}
