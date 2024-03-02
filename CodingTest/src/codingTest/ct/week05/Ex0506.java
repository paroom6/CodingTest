package codingTest.ct.week05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,7,11,15,20,28,29,31,39,58,68,70,95};
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 수 : ");
		int n = sc.nextInt();
		
		int idx = Arrays.binarySearch(arr, n);
		if(idx < 0) {
			System.out.println(String.format("존재하지 않는 수: %d(%d)", n, idx));
		} else {
			System.out.println(String.format("수 %d는 arr[%d]에 존재", n, idx));		
		}
	}

}