package codingTest.ct.week04;

import java.util.Arrays;
import java.util.Stack;

public class Ex0401 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();//LIFO, Last in First out.
		stack.push(1);
		System.out.println(stack.toString());
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.peek());	
		System.out.println(stack.get(0));
		System.out.println(stack.toString());
		System.out.println(stack.isEmpty());
		System.out.println(stack.search(3));//-1 or 순번호(1부터 시작, 뒤에서 부터 카운팅)
		System.out.println(stack.contains(1));//true, false
		System.out.println(stack.containsAll(Arrays.asList(1,2,3)));//전부 포함되면 true, false
		System.out.println(stack.size());
	}

}
