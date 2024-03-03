package codingTest.ct.week05;

public class Ex0509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int x[] = {1,3,9,4,7,8,6};
		bobbleSort(x);
		for(int i = 0; i < n; i++) {
			System.out.println(String.format("x[%d] = %d", i, x[i]));
		}
	}
	static void bobbleSort(int a[]) {
		int comp = 0;
		int exchange = 0;
		for(int i = 0; i < a.length; i++) {
			 System.out.println("패스 : " + (i + 1));
			for(int j = a.length - 1; j > i; j--) {
				if(a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchange++;
				}
				for(int k = 0; k < a.length; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
				comp++;
			}
		}
		System.out.println("비교횟수 : " + comp);
		System.out.println("교환횟수 : " + exchange);
	}
	static void swap(int a[], int n, int m) {
		int temp = a[n];
		a[n] = a[m];
		a[m] = temp;
	}
}
