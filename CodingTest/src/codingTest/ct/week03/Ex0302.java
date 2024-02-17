package codingTest.ct.week03;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.Scanner;



public class Ex0302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayQueue queue = new ArrayQueue(5);
		while(true) {
			System.out.println(String.format("현재 수: %d /%d", queue.size(), queue.capacity()));
			System.out.print("1. enq(add), 2. deq(poll), 3. peek, 4. clear, 5. dump, 0. 종료(break) ");
			
			int num = sc.nextInt();
			if(num == 0) {
				System.exit(0);
				break;
			}
			int x;
			
			switch (num) {
			case 1:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				queue.add(x);
				break;
				
			case 2: 
				x = queue.poll();
				System.out.println("나간 데이터 : " + x);
				break;
				
			case 3: 
				x = queue.peek();
				System.out.println("첫번쩨 데이터 : " + x);
				break;
				
			case 4: 
				queue.clear();
				break;
				
			case 5: 
				queue.dump();
				break;
				
			}
			
		}
	}

}

class ArrayQueue {
	private int max; 	//큐의 최대용량
	private int front;	//첫번째 요소의 커서
	private int rear; 	//마지막 요소의 커서
	private int cnt; 	//현재데이터의 수
	private int[] queue;//큐
	
	public ArrayQueue(int capacity) {
		this.max = capacity;
		//뒤에서 앞으로 대입하기에 가능하다.
		this.cnt = this.front = this.rear = 0;
		
		try {
			queue = new int[max];
		} catch(Exception e) {
			max = 0;
		}
	}
	
	public int add(int num) {
		if(cnt >= max) {
			System.out.println("Queue is Full.");
			return num;
		}
		queue[rear++] = num;
		cnt++;
		return num;
	}
	
	public int peek() {
		if(cnt <= 0) {
			System.out.println("Queue is Empty");
		}
		return queue[front];
	}
	
	public int poll() {
		int x = queue[front++];
		cnt--;
		if(cnt < 0) cnt = 0;
		if(front == max) front = 0;
		return x;  
	}
	
	public void clear() {
		this.rear = this.cnt = this.front = 0;
	}
	
	public boolean isEmpty() {
		
		return this.cnt <= 0;
	}
	
	public int capacity() {
		
		return max;
	}
	
	public boolean isFull() {
		
		return this.cnt >= max;
	}
	
	public int size() {
		return this.cnt;
	}
	
	public void dump() {
		if(cnt <=0) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println(Arrays.toString(queue));
		}
	}
}