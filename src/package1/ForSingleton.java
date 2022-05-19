package package1;

public class ForSingleton {

	static ForSingleton f; 
	private ForSingleton() {
		
	}
	
	public static ForSingleton getobj() {
		
		System.out.println(f);
		
		if(f==null) {
		f = new ForSingleton();
		}
		return f;
	}
	 
	public void add()
	{
	}
	
	public static void main(String[] args) {
		
		ForSingleton obj = getobj();
		obj.add();
		ForSingleton obj1 = getobj();
		ForSingleton obj2 = getobj();
		System.out.println(System.identityHashCode(obj1));
	}
	
}
