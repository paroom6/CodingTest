package codingTest.ct.week01;

public class Ex0111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 구구단
		 * 
		 */
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %-2d \n", i, j, (i * j));
			}
			System.out.println();
		}
	}

}
