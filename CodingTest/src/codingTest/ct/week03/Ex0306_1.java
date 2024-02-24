package codingTest.ct.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex0306_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));//Scanner에 비해 훨씬 빠르다.
		LinkedList<Integer> queue = new LinkedList<Integer>();
		String n = sc.readLine();
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < Integer.parseInt(n); i++) {
			String str = sc.readLine();
			StringTokenizer st = new StringTokenizer(str);//.공백을 기준으로 분리
			String cmd = st.nextToken();//토큰 입력
			switch (cmd) {
			case "push":
				queue.offer(Integer.parseInt(st.nextToken()));
				break;
			case "pop" : 
				if(queue.isEmpty()) {
//					System.out.println(-1);
					builder.append(-1).append("\n");
				} else {
//					System.out.println(queue.pollFirst());
					builder.append(queue.poll()).append("\n");
				}
				break;
			case "size" : 
				builder.append(queue.size()).append("\n");
				break;
			case "empty" :
				if(queue.isEmpty()) {
					builder.append(1).append("\n");
				} else {
					builder.append(0).append("\n");
				}
				break;
			case "front" :
				if(queue.isEmpty()) {
					builder.append(-1).append("\n");
				} else {
					builder.append(queue.getFirst()).append("\n");
				}
				break;
			case "back" :
				if(queue.isEmpty()) {
					builder.append(-1).append("\n");
				} else {
					builder.append(queue.getLast()).append("\n");
				}
				break;
			default :
				break;
			}
			
		}
		System.out.println(builder.toString());
	}

}
