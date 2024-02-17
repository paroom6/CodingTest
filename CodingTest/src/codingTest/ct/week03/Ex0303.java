package codingTest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex0303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while(queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.peek());
	}

}
