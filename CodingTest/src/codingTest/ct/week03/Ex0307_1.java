package codingTest.ct.week03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Ex0307_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			LinkedList<Integer[]> queue = new LinkedList<Integer[]>();
			int cnt = 0;
			int m = sc.nextInt();
			int	findIndex = sc.nextInt();
			for(int j = 0; j < m; j++) {
				Integer[] temp = {sc.nextInt(),j};
				queue.offer(temp);
			}
			while(!queue.isEmpty()) { //queue 값을 나열 인덱스가 다른 더 큰 숫자가 있으면 뒤로
				Integer[] max = queue.poll();
				boolean isMax = true;
				for(int j = 0; j < queue.size(); j++) {
					if(max[0] < queue.get(j)[0]) {
						queue.offer(max);
						isMax = false;
						break;
					}
				}
				if(!isMax) {
					continue;
				}
				cnt++;
				if(max[1] == findIndex) {
					break;
				}
			}
			System.out.println(cnt);
		}
	}

}
