import java.util.*;

public class Main {

	public static int cal(int A, int B){
		int result = (A+B)*(A-B);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(cal(A,B));
		sc.close();
		
	}
}