import java.io.*;
import java.lang.*;
import java.util.Scanner;

/*
알고리즘 특강 시간에 푼 문제입니다.

순서가 중요한 경우에는 순열을 만들어야한다.

문제의 컨셉
- 5를 예로 들면 1+4, 4+1이 만들어진다. -> 4는 1,2,3의 조합으로 이루어질 수 있다.
- 재귀로 풀어보고 DP(시간복잡도를 개선하기 위한)를 적용해서 풀어보기

n이 무슨 수인지 모르면?
n-3, n-2, n-1 ...

 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수 입력
        // System.out.println("T : " + T);
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // 정수 n 입력 받음
            // System.out.println("n : " + n);
            // 풀이 시작
            result = 0;
            recursive(n);
            System.out.println(result);
        }
        sc.close();
    }

    public static int result = 0;

    public static void recursive(int num) {
        // 1. 스스로를 호출한다
        // 2. 종료조건이 있어야 함
        // 종료 조건
        if (num == 0) {
            result++; // 해당 조합을 카운트
            return;
        }
        // 호출 조건
        if (num >= 1) {
            recursive(num - 1);
        }
        if (num >= 2) {
            recursive(num - 2);
        }
        if (num >= 3) {
            recursive(num - 3);
        }
    }
}

