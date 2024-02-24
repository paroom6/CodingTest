package codingTest.ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class Ex0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			switch (str) {
			case "1":
				stack.push(sc.nextInt());
				break;
			case "2":
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.pop()).append("\n");				
				}
				break;
			case "3":
				sb.append(stack.size()).append("\n");				
				break;
			case "4":
				sb.append(stack.isEmpty()? 1 : 0).append("\n");	
				break;
			case "5":
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
		sc.close();	
	}

}