package package1;

import package2.ForConstructor2;

public class ForConstructor1 extends ForConstructor2 {
	//default cons
	public ForConstructor1() {
		super();
		System.out.println("default cons1");
	}
	
	//string cons
	public ForConstructor1(String a) {
		this();
		System.out.println("str cons" +a);
	}
	
	//int int cons
	public ForConstructor1(String s ,int b) {
		this("name");
		System.out.println("double para " +s +" " +b);
	}
	
	public static void main(String[] args) {
		
		new ForConstructor1("gayu", 20);
	}
	
	}

