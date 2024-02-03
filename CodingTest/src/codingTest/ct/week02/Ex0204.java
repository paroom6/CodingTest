package codingTest.ct.week02;

import java.util.Arrays;
import java.util.List;

public class Ex0204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
		for(int i = 0; i < list1.size(); i++) {
			System.out.printf("문자 : %s \n",list1.get(i));
		}
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.printf("숫자 : %d \n",list2.get(i));
		}
	}

}
