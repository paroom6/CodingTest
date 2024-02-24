package codingTest.ct.week04;

import java.util.Scanner;

public class Ex0402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		ArrayStack stack = new ArrayStack(max);
		while (true) {
			System.out.println(String.format("현재 수: %d", stack.size(), stack.capacity()));
			System.out.println("1.push, 2.pop, 3.peek, 4.clear, 5.dump, 0.exit");
			int num = sc.nextInt();
			if(num == 0) break;
			int x;
			switch (num) {
			case 1:
				System.out.println("Push : ");
				x = sc.nextInt();
				stack.push(x);
				break;
			case 2:
				System.out.println(String.format("Pop : %d",stack.pop()));
				break;
			case 3: 
				System.out.println(String.format("Peek : %d",stack.peek()));
				break;
			case 4: 
				stack.clear();
				break;
			case 5: 
				stack.dump();
				break;
			default:
				break;
			}
		}
		
	}

}

class ArrayStack {
	private int top;
	private int capacity;
	private Object stack[];
	public ArrayStack(int max) {
		this.top = -1;
		this.capacity = max;
		stack = new Object[max];
	}
	public void push(Object obj) {
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			stack[++top] = obj;
		}
		
	}
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!");
			return null;
		} else {
			Object obj = stack[top];
			return obj;
		}	
	}
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!!");
			return null;
		} else {
			Object obj = stack[top];
			stack[top--] = null;
			return obj;
		}
		
	}
	
	public void clear() {
		this.top = -1;
		stack = new Object[capacity];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top >= capacity - 1);
	}
	public int size() {
		return top + 1;
	}
	public int capacity() {
		return capacity;
	}
	
	public void dump() {
		for(Object obj : stack) {
			if(obj != null) {
				System.out.print(obj + " ");
			}
		}
		System.out.println();
	}
	
	
}