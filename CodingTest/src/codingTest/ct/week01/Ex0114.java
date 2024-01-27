package codingTest.ct.week01;

public class Ex0114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Good Morning";
		System.out.println("charAt : " + str.charAt(7));
		System.out.println("startsWith : " + str.startsWith("good"));
		System.out.println("endsWith : " + str.endsWith("ng"));
		System.out.println("equals : " +str.equals("good"));
		System.out.println("indexOf : " +str.indexOf("Mor"));
		System.out.println("lastIndexOf : " +str.lastIndexOf("Mor"));
		System.out.println("length() : " +str.length());
		System.out.println("replace : " +str.replace("Good", "a"));
		System.out.println("replace : " +str.replace("o", "a"));
		System.out.println("replaceAll : " +str.replaceAll("Good", "a"));
		System.out.println("replaceAll : " +str.replaceAll("[Good]", "a"));
		
		
		
	}

}
