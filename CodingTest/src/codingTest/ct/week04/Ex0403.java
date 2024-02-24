package codingTest.ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class Ex0403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * push는 오름차순으로 진행된다. 
		 * 12345678
		 * 배열의 숫자와 같다면 pop();
		 * 다시 오름차순으로 push();
		 * 반복하여 배열이 출력가능하면 +-리턴
		 * 아니면 NO
		 */
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		int top = 0;
		while (n > 0) {
			int m = sc.nextInt();
			if(m > top) {
				for(int i = top + 1; i <= m; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				top = m;
			}else if(stack.peek() != m) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append("-").append("\n");
			n--;
		}
		System.out.println(sb.toString());
		
	}

}
