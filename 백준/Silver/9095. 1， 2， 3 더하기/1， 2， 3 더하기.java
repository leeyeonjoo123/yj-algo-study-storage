import java.util.*;
import java.io.*;
/*
알고리즘 특강 시간에 푼 문제. 
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수 입력
        // System.out.println("T : " + T);
        int[] dp = new int[12]; // 0부터 시작하니까 인덱스 끝을 11.
        dp[1] = 1; // 1
        dp[2] = 2; // 1+1, 2
        dp[3] = 4; // 3, 1+1+1, 2+1, 1+2
        for (int j = 4; j < 12; j++) {
            // 점화식
            dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
        }
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // 정수 n 입력 받음
            // System.out.println("n : " + n);
            // 풀이 시작
            System.out.println(dp[n]);
            // (재귀 풀이)
            // result = 0;
            // recursive(n);
            // System.out.println(result);
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