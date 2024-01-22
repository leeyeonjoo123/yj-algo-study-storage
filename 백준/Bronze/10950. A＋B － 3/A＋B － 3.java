import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.stream.Stream;

/*
로직.
입력 - scanner(숫자값 입력)
input
for(int i = 1; i <10 ; i++) {
    Sout( input + " * " + i " = " + input*i );
    }
 */


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 T
        int T = sc.nextInt();
        //System.out.println(T);
        int[] A = new int[T];
        int[] B = new int[T]; //길이 T인 배열
        // 테스트 케이스(0부터 테스트 케이스 수만큼 반복)

        // 입력
        for (int i = 0; i < T ; i++) {
            //for문 돌때마다 A, B 생성 및 저장
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();

//            sc.nextLine();
//            System.out.println( "A : " + A + "  B : " + B + " i : " + i);
            // 입력 조건 만족하는지 확인
//            checkInput(A[i], B[i]);

//            System.out.println(A[i+B);
        }

        //출력
        for(int i=0; i<T; i++){
            System.out.println(A[i]+B[i]);
        }

        sc.close();
    }

    // 입력 조건에 맞지 않은 값이 입력되면 프로그램 종료
    public static void checkInput(int A, int B) {
        if ((A < 1 || A > 10) || (B < 1 || B > 10)) {
            System.out.println(A+" "+B);
            System.exit(0);
        }
    }
}
