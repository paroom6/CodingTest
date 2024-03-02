package codingTest.ct.week05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(95);
		scores.add(87);
		scores.add(78);
		scores.add(97);
		scores.add(85);
		NavigableSet<Integer> desc = scores.descendingSet();
		NavigableSet<Integer> asc = desc.descendingSet();
		int num = 0;
		while (!desc.isEmpty()) {
			num = desc.pollLast();
			System.out.println(num + "(남은 객체수 :" + desc.size() +")");
		}

		while (!asc.isEmpty()) {
			num = asc.pollLast();
			System.out.println(num + "(남은 객체수 :" + asc.size() +")");
		}
		
	}

}
