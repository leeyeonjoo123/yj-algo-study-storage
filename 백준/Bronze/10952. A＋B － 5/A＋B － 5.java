import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
입력이 0이면 반복문 종료
방법1.
A + B

 */


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        // 반복해야될 숫자를 모르니 while문 사용
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            result = A + B;

            if(A == 0 && B == 0){
                break;
            } 
            System.out.println(result);
        }

        sc.close();
    }
}
