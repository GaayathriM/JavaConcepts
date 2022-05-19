package package1;

public class ForException2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try { //1
			
			try { //2
				System.out.println(2/0);
			}
			catch(ArithmeticException e){ //2
				System.out.println(e);
			}
			finally { //2
				System.out.println("finally 2");
			}
			System.out.println(2/0);
			try { //3
			String s = null;
			s.charAt(2);
			}
			catch(Exception e) { //3
				System.out.println(e);
			}
			
		}
		catch(NullPointerException e) {//1
			System.out.println(e);
		}
		catch(ArithmeticException e) { //1
			System.out.println(e);
		}
		
		finally {
			System.out.println("finally 1");
		}
		System.out.println(3);
	}
}
