package codingTest.ct.week05;

import java.util.Scanner;

public class Ex0504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 선형검색
		 * 직선으로 늘어선 배열에서 원하는 키값을 가진 요소를 만날때까지 앞에서부터 요소를 검색하는 알고리즘
		 * 이진검색
		 * 요소가 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘
		 */
		int[] arr = {6, 4, 8, 3, 2, 1};//선형검색
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 수 : ");
		int n = sc.nextInt();
		int idx = SequenceSearch.sequenceSearch(arr, n);
		if(idx == -1) {
			System.out.println(String.format("존재하지 않는 수: %d", n));
		} else {
			System.out.println(String.format("수 %d는 arr[%d]에 존재", n, idx));
			
		}
	}

}

class SequenceSearch{
	static int sequenceSearch(int[]a, int key) {
		for(int i =0; i < a.length; i++) {
			if(a[i] == key) return i;
		}
		return -1;
	}
}
