import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = sc.nextLong();
		long n = sc.nextLong();
		long result = Math.abs(m-n);
		System.out.println(result);
		sc.close();
		}
}

