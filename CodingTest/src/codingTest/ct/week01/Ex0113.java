package codingTest.ct.week01;

public class Ex0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i = 0; i < 5; i++) { for(int j = 0; j < i + 1; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		/*
		 * for(int i = 0; i < 5; i++) { for(int j = 1; j < 5 - i; j++) {
		 * System.out.print(" "); } for(int j = 0; j < i + 1; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		/*
		 * for(int i = 0; i < 5; i++) { for(int j = 0; j < 5 - i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		/*
		 * for(int i = 0; i < 5; i++) { for(int j = 0; j < i; j++) {
		 * System.out.print(" "); } for(int j = 0; j < 5 - i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */

		
		/*
		 * for(int i = 0; i < 5; i++) { for(int j = 1; j < 5 - i; j++) {
		 * System.out.print(" "); } for(int j = 0; j < 2 * i + 1; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		for(int i = 0; i < 5; i++) { //행렬의 구조 
			for(int j = 0; j < i; j++) {
				System.out.print(" "); 
			} 
			for(int j = 0; j < 9 - 2 * i; j++) {
				System.out.print("*"); 
			}
			System.out.println(); 
		}

	}

}
