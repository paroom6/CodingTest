package codingTest.ct.week05;

import java.util.Scanner;

public class Ex0508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 정렬
		 * -교환 
		 * -선택 
		 *  단순선택정렬: 가장작은 요소를 맨 앞으로 이동, 두번째로 작은 요소를 두번째로 이동하는 작업을 반복하는 알고리즘
		 * -삽입
		 * 	단순삽입정렬: 선택한 요소를 그보다 더 앞쪽의 알맞은 위치에 삽입하는 작업을 반복하여 정렬하는 알고리즘
		 */	
		Scanner sc = new Scanner(System.in);
		System.out.println("버블정렬 전");
		System.out.print("개수: ");
		int n = sc.nextInt();
		int x[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println(String.format("x[%d]", i));
			x[i] = sc.nextInt();
		}
		
		bobbleSort(x, n);
		
		System.out.println("버블정렬 후");
		for(int i = 0; i < n; i++) {
			System.out.println(String.format("x[%d] = %d", i, x[i]));
		}
	}
	static void bobbleSort(int a[], int n) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
	}
	static void swap(int a[], int n, int m) {
		int temp = a[n];
		a[n] = a[m];
		a[m] = temp;
	}
}