package codingTest.ct.week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set.size());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		set.add("A");
		for(String str : set) {
			System.out.println(str);
		}
	}

}


