import java.util.*;
import java.io.*;

/*
알고리즘 특강 시간에 푼 문제입니다.
*/
public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 수열의 크기 N과 찾고자 하는 합 M을 입력받음
        int N = sc.nextInt(), M = sc.nextInt();

        // 수열을 저장할 배열 arr 생성
        int[] arr = new int[N];

        // N개의 정수를 입력받아 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 입력이 끝났으므로 Scanner 객체를 닫음
        sc.close();

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        // 투 포인터 알고리즘을 위한 변수들 초기화
        int cnt = 0, left = 0, right = N - 1;

        // 수열을 탐색하는 루프
        while (left < right) {
            // 현재 합 계산
            int sum = arr[left] + arr[right];

            // 합이 M과 같으면, 경우의 수 cnt를 1 증가하고 left와 right를 각각 1 증가, 감소
            if (sum == M) {
                cnt++;
                left++;
                right--;
            } 
            // 합이 M보다 작으면, left를 1 증가
            else if (sum < M) {
                left++;
            } 
            // 합이 M보다 크면, right를 1 감소
            else {
                right--;
            }
        }

        // 합이 M이 되는 두 수의 경우의 수 출력
        System.out.println(cnt);
    }
}