package codingTest.ct.week01;

import java.util.Arrays;

public class Ex0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %-2d 	", j, i, (i * j));
			}
			System.out.println();
		}
		
		String a = "a";
		int[] i = {1,2,3,4,5,9,7};
		Arrays.sort(i);
		for(int k = 0; k < i.length; k++ ) {
			System.out.println(i[k]);
		}
	}

}
