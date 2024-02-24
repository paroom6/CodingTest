package codingTest.ct.week04;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex0405_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			switch (num) {
			case 1:
				int x = sc.nextInt();
				stack.push(x);
				break;
			case 2:
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.pop()).append("\n");
				}
				break;
			case 3:
				sb.append(stack.size()).append("\n");
				break;
			case 4:
				sb.append(stack.isEmpty()? 1 : 0).append("\n");
				break;
			case 5:
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.peek()).append("\n");
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb.toString());
	}

}