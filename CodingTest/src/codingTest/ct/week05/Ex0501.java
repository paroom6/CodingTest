package codingTest.ct.week05;

import java.util.TreeSet;

public class Ex0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(95);
		scores.add(87);
		scores.add(78);
		scores.add(97);
		scores.add(85);
		int score = 0;
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		score = scores.floor(88);
		System.out.println("88점 이하: " + score);		
		score = scores.ceiling(88);
		System.out.println("88점 이상: " + score);
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체수 :" + scores.size() +")");
		}
		
	
	}
	

}
