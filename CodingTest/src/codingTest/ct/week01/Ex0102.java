package codingTest.ct.week01;

public class Ex0102 {

	public static void main(String[] args) {
		byte b = 0; 			// 1byte  = 8bit
		char c = 'A', c1 = 65;  //2byte 아스키코드도 가능
		short s = 1000; 		//2byte
		int i = 65; 			//4byte
		long l = 100000000000l; //8byte 기본은 int이기 때문에 l을 붙여 long임을 표시해야한다.
		
		float f = 3.141592f; 	//4byte 기본이 double로 잡혀있기에 f를 붙여 float를 표시해야한다.
		double d = 3.141592;	//8byte
		
		boolean t = false; 		//1bit true or false 만 표시 가능하다.
		
	}

}
