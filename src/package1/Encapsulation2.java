package package1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class Encapsulation2 {
	public static void main(String[] args) {
		EncapsulationEx e1 = new EncapsulationEx();
		e1.setId(1);
		e1.setName("student1");
		//System.out.println(e1.getId());
		//System.out.println(e1.getName());
		EncapsulationEx e2 = new EncapsulationEx();
		e2.setId(2);
		e2.setName("Student2");
		//System.out.println(e2.getId());
		//System.out.println(e2.getName());
		
		//user defined list
		List<EncapsulationEx> l = new ArrayList<EncapsulationEx>();
		l.add(e1);
		l.add(e2);
		//System.out.println(l.size());
		
		for (int i = 0; i < l.size(); i++) {
			
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
		}
		System.out.println("======");
		//user defined set
		
		Set<EncapsulationEx> s = new HashSet<EncapsulationEx>();
		s.add(e1);
		s.add(e2);
		
		for (EncapsulationEx x : s) {
			
			System.out.println(x.getId());
			System.out.println(x.getName());
			
		}
		
		//user defined map
		System.out.println("======");
		Map<Integer, EncapsulationEx > m = new TreeMap<Integer, EncapsulationEx >();
		m.put(1, e1);
		m.put(2, e2);
		//System.out.println(m);
		
		Set<Entry<Integer, EncapsulationEx>> es = m.entrySet();
		
		for (Entry<Integer, EncapsulationEx> entry : es) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());
		}
	}
}
