package codingTest.ct.week01;

public class Ex0116 {

	public static void main(String[] args) {
		/*
		 * 1차원 배열
		 * byte ~ int = 0, long = 0L float = 0.0F
		 * boolean = false
		 * class, object = null - Integer나 Boolean의 경우 null값이 존재
		 * 	
		 */
		int[] a;
		int b[];
		
//		1차원 배열의 초기화
		char[] c = {'A', 'B', 'C'};
		int d[] = new int [3];
		System.out.println(c[1]);
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		System.out.println(d[2]);
		
		float f[] = new float[] {1.2F, 2.3F, 3.4F};
		f[2] = 4.3F;
		
		int[] score = new int[10];
		for(int i = 0; i < 10; i++) {
			score[i] = i;
		}
		int sum; //선언후 초기화가 표준
		sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
	}

}
