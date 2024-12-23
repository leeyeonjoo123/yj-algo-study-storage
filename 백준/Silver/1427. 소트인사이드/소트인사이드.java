import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int A[] = new int[str.length()];
		
		for(int i =0; i<str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i, i+1));
		}
		
		//선택정렬
		for(int i = 0; i < str.length(); i++) {
			int Max = i; //맨앞의 값이 최댓값
			for(int j = i+1; j<str.length(); j++) {
				if(A[j] > A[Max]) {
					Max = j; // 탐색한 값이 Max보다 크면 Max값 바꾸기
				}
			}
			//swap할 때는 temp(임시변수) 만들어서 해주기
			if(A[i] < A[Max]) {
				int temp = A[i];
				A[i] = A[Max];
				A[Max] = temp; 
			}
		}
		for(int i=0; i<str.length(); i++) {
			System.out.print(A[i]);
		}
	}
}