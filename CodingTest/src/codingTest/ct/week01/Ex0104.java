package codingTest.ct.week01;

public class Ex0104 {

	public static void main(String[] args) {
		int i = 88;
		if(i > 90) System.out.println("A"); //실행문이 1개일 때 {} 생략가능 
		else if(i > 80) System.out.println("B");
		else if(i > 70) System.out.println("C");
		else if(i > 60) System.out.println("D");
		else {
			System.out.println("F");
			System.out.println("낙제");
		}
		
	}

}