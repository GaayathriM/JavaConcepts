package package1;
import java.util.ArrayList;
import java.util.List;
public class ForList {
	public static void main(String[] args) {
	//to create list
	List<Integer> l = new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(10);
	l.add(20);
	// to print the list
	System.out.println(l);
	//to find list size
	System.out.println(l.size());
	//to get a value at an index
	System.out.println(l.get(4));
	//to get the index of a value
	System.out.println(l.indexOf(20));
	//to get the last index of a value
	int lastIndexOf = l.lastIndexOf(10);
	System.out.println(lastIndexOf);
	boolean contains = l.contains(100);
	System.out.println(contains);
	//to add the value in particular index
	l.add(3, 70);
	System.out.println(l);
	l.set(3, 80);
	System.out.println(l);
	l.remove(3);
	System.out.println(l);
	
	List<Integer> l1 = new ArrayList();
	l1.add(100);
	l1.add(200);
	l1.add(30);
	System.out.println(l1);
	//to add 2 lists
	boolean addAll = l.addAll(l1);
	System.out.println(addAll);
	System.out.println("list L after adding 2 lists");
	System.out.println(l);
	System.out.println("size of list l: "+l.size());
	System.out.println("list L1");
	System.out.println(l1);
	l.retainAll(l1);
	System.out.println("list L after retainAll mtd");
	System.out.println(l);
	l.removeAll(l1);
	System.out.println("list L after removeAll mtd");
	System.out.println(l);
	
}
}