package set;

import java.util.HashSet;
import java.util.TreeSet;

public class IntSetTest {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(10);		set1.add(10);
		set1.add(21);		set1.add(9);
		set1.add(88);		set1.add(22);
		set1.add(33);		set1.add(14);
		set1.add(24);		set1.add(64);
		set1.add(2);
		
		System.out.println(set1);
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(10);		set2.add(10);
		set2.add(21);		set2.add(9);
		set2.add(88);		set2.add(22);
		set2.add(33);		set2.add(14);
		set2.add(24);		set2.add(64);
		set2.add(2);
		
		System.out.println(set2);
		
		
	}

}
