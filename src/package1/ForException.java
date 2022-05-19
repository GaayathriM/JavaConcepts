package package1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForException {

	public static void main(String[] args) {
		System.out.println();
		
		//Arithmetic exception
		//System.out.println(10/0);
		
		//NullPointerException
		
		//String s = null;
		//System.out.println(s.charAt(0));
		
		//StringIndexOutOfBounds exception
		//String s1 = "java";
		//System.out.println(s1.charAt(4));
		
		//ArrayIndexOutOfBoundsException
		//int a[] = new int[2];
		//System.out.println(a[2]);
		
		//IndexOutOfBoundsException
		//List l = new ArrayList();
		//l.add(10);
		//l.add("java");
		//System.out.println(l.get(2));
		
		//InputMismatchException
		//Scanner scan = new Scanner(System.in);
		//int a = scan.nextInt();
		//System.out.println(a);
		//int b = scan.nextInt();
		//System.out.println(b);
		
		//NumberFormatException
		String s2 = "12345";
		System.out.println(s2);
		System.out.println(s2+10);
		
		//to convert String to int
		int parseInt = Integer.parseInt(s2);
		System.out.println(parseInt);
		System.out.println(parseInt+10);
		
		String s3 = "123a4";
		System.out.println(s3);
		System.out.println(s3+10);
		int parseInt2 = Integer.parseInt(s3);
		System.out.println(parseInt2);
		System.out.println(parseInt2+10);
	}
}
