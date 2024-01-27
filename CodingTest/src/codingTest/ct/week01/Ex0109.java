package codingTest.ct.week01;

public class Ex0109 {

	public static void main(String[] args) {
		ep: // 라벨
		while(true) {
			for(int i = 0; i < 100; i++) {
				if(i == 50) {
					break ep; //반복문 종료시 라벨로 나간다.
				}
				System.out.println(i);
			}
		}
		
	}

}
