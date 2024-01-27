package codingTest.ct.week01;

public class Ex0115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaa";
		String str2 = "aaa";
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		String str3 = new String("aaa"); 
		String str4 = new String("aaa"); 
		System.out.println(str3 == str4);
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str3));
		System.out.println(str1.repeat(2));//횟수만큼 반복
	}

}
