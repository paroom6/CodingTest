package codingTest.ct.week05;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex0507 {
	private static int n;
	private static int[] parent;
	private static boolean[] visited ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		parent = new int[n];
		visited = new boolean[n];
		
//		String str =sc.nextLine();
//		StringTokenizer st = new StringTokenizer(str);
		for(int i = 0; i < n; i++) {
			parent[i] = sc.nextInt();
		}
		int rmIdx = sc.nextInt();
		remove(rmIdx);
		int sum = leafCount();
		System.out.println(sum);
	}
	/**
	 * 배열 - 부모객체 연결 - 체크 여부
	 * 리프인지 아닌지 
	 */
	//삭제
	static void remove(int idx) {
		visited[idx] = true;
		for(int i = 0; i < parent.length; i++) {
			if(parent[i] == idx) {
				remove(i);
			}
		}
	}
	//리프로드 확인
	static boolean isLeaf(int idx) {//자식 객체가 삭제되었다면 그것은 리프인가?
		visited[idx] = true;
		for(int i = 0; i < parent.length; i++) {
			if(visited[i]) {
				continue;
			}
			if(parent[i] == idx) {
				return false;
			}
		}
		return true;
	}
	//리프로드 갯수
	static int leafCount() {
		int c = 0;
		for(int i = 0; i < parent.length; i++) {
			if(visited[i]) {
				continue;
			};
			if(isLeaf(i)) {
				c++;
			}
		}
		return c;
	}
}
