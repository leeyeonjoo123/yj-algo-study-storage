import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 T
        int T = sc.nextInt();
        //System.out.println(T);
        int[] A = new int[T];
        int[] B = new int[T]; //길이 T인 배열
        int result = 0;

        // 입력
        for (int i = 0; i < T ; i++) {
            //for문 돌때마다 A, B 생성 및 저장
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            sc.nextLine();

        }

        //출력
        for(int i=0; i<T; i++){
            System.out.println("Case #" + (i+1) + ": " + A[i] + " + " + B[i] + " = " + (A[i]+B[i]));
        }

        sc.close();
    }

    // 입력 조건에 맞지 않은 값이 입력되면 프로그램 종료
    public static void checkInput(int A, int B) {
        if ((A <= 0 || B >= 10)) {
            System.out.println(A+" "+B);
            System.exit(0);
        }
    }
}
