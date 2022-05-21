package package2;


public class ForConstructor2 {

	public ForConstructor2() {
		this(100, "jayanthi");
		System.out.println("parent default");
	}
		
	public ForConstructor2(int e) {
		System.out.println("parent int "+e  );
	}
	public ForConstructor2(int u, String k) {
		this(300);
	System.out.println("parent int str "+u +" "+k );
	System.out.println("line added by Mohan branch");
}
}
