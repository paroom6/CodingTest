package codingTest.ct.week02;

public class Ex0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MaxMin.max(1, 2, 3));
		System.out.println(MaxMin.max(10, 2, 3));
		System.out.println(MaxMin.max(1, 20, 3));
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};
		System.out.println(MaxMin.max(arr));
		System.out.println();
		System.out.println(MaxMin.maxmin(arr)[1]);
	}

}
class MaxMin{
	static int max(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	static int max(int[] arr) {
		if(arr.length == 0) return -1; // 모든 경우의 수 카운팅 - arr 값이 존재하지 않을 때 
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}
	
	static int min(int[] arr) {
		if(arr.length == 0) return -1;
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) min = arr[i];
		}
		return min;
	}
	
	static int[] maxmin(int[] arr) {
		int[] mm = new int[2];
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		mm[0] = max;
		mm[1] = min;
		
		return mm;
	}
}