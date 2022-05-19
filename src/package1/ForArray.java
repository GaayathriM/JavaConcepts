package package1;

public class ForArray {
	
public static void main(String[] args) {

	int a[][] = new int[2][2];
	a[0][0] = 10;
	a[0][1] = 20;
	a[1][0] = 30;
	a[1][1] = 40;
	
	//int a[][]= {{10,20},{30,40}};
	
	System.out.println(a[1][0]);
	
	//nested for loop
	for (int i = 0; i < a.length; i++) {
		
		for (int j = 0; j < a.length; j++) {
			
			System.out.println(a[i][j]);
		}
	}
	//enhanced for loop
	for (int[] is : a) {
		for (int i : is) {
			System.out.println(i);
		}
	}
}

}
