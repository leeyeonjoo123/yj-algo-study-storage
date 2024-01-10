import java.lang.NumberFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // 비교하는 함수 작성
        if(A == B) {
            System.out.println("==");
        }
        else if(A < B) {
            System.out.println("<");
        }
        else
            System.out.println(">");
    }
}
