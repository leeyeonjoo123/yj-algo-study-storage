import java.io.*;
import java.lang.*;
import java.util.Scanner;

/*
로직.
입력 - scanner - 숫자 한개만 입력받으면 되니깐.(buffer로 하면 형변환해야됨)
input
for(int i = 1; i <10 ; i++) {
    Sout( input + " * " + i " = " + input*i );
    }
 */


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        // 입력 조건 만족하는지 확인
        checkInput(input);

        //for문으로 구구단 출력
        for (int i = 1; i < 10 ; i++) {
            System.out.println( input + " * " + i + " = " + input*i);
        }

        sc.close();
    }

    // 입력 조건에 맞지 않은 값이 입력되면 프로그램 종료
    public static void checkInput(int input) {
        if (input < 1 || input > 10 ) {
            System.exit(0);
        }
    }
}
