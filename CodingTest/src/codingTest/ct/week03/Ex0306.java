package codingTest.ct.week03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			String cmd = sc.next();
			switch (cmd) {
			case "push":
				queue.offer(sc.nextInt());
				break;
			case "pop" : 
				if(queue.size() > 0) {
					System.out.println(queue.pollFirst());
				}
				break;
			case "size" : 
				System.out.println(queue.size());
				break;
			case "empty" :
				if(queue.size() > 0) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
				break;
			case "front" :
				if(queue.size() > 0) {
					System.out.println(queue.peekFirst());
				}
				break;
			case "back" :
				if(queue.size() > 0) {
					System.out.println(queue.peekLast());
				} 
				break;
			default : 
				System.out.println(-1);
			}
			
		}
		
	}

}

