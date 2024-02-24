package codingTest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;

public class Ex0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Queue 선입선출
		 * offer() 로 객체 입력
		 * peek()로 객체를 가져온다 객체를 큐에서 제거하지 않는다.
		 * poll 객체를 가져온다 객체를 큐에서 제거한다.
		 * en: 입력을 의미
		 * de: 출력을 의미
		 * */
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		System.out.println(queue.toString());
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		System.out.println(queue.toString());
		System.out.println(queue.peek());
		System.out.println(queue.toString());
		System.out.println(queue.poll());
		System.out.println(queue.toString());
		System.out.println(queue.isEmpty());
		queue.clear();
		System.out.println(queue.toString());
		
	}

}
