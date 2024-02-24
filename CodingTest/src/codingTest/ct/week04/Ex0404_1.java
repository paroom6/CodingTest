package codingTest.ct.week04;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex0404_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			System.out.println(str);
			StringTokenizer st = new StringTokenizer(str);
			String cmd = st.nextToken();
			switch (cmd) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				stack.push(x);
				break;
			case "pop":
				if(stack.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(stack.pop() + "\n");
				}
				break;
			case "size":
				sb.append(stack.size() + "\n");
				break;
			case "empty":
				sb.append(stack.isEmpty()? 1 : 0 + "\n");
				break;
			case "top":
				if(stack.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					sb.append(stack.peek() + "\n");
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb.toString());
	}

}
