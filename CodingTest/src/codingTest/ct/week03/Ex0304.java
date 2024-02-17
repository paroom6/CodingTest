package codingTest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i = 1; i < n; i++) {
			queue.offer(i);
		}
		int c = 0;
		for(int t : arr) {
			int idx = queue.indexOf(t);
			int h = queue.size() / 2;
			if(idx < h) {
				while (t != queue.getFirst()) {
					queue.addLast(queue.removeLast());
					c++;
				}
				queue.pollFirst()
			}else {
				while (t != queue.getFirst()) {
					queue.addFirst(queue.removeLast());
					c++;
				}
				queue.pollFirst();
			}
		}
		System.out.println(c);
	}	

}