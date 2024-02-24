package codingTest.ct.week04;

import java.util.Scanner;
import java.util.Stack;

public class Ex0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
 		//System.out.println();보다 StringBuilder를 사용하는 편이 빠르다.
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			switch (str) {
			case "push":
				stack.push(sc.nextInt());
				break;
			case "pop":
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.pop()).append("\n");				
				}
				break;
			case "size":
				sb.append(stack.size()).append("\n");				
				break;
			case "empty":
				sb.append(stack.isEmpty()? 1 : 0).append("\n");	
				break;
			case "top":
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
