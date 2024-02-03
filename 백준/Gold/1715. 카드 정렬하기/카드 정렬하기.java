import java.util.*;
import java.io.*;

/*
알고리즘 특강 시간에 푼 문제입니다.
*/

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 카드 묶음의 개수 N을 입력받음
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 오름차순. (디폴트)
        
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            pq.add(n); // 넣을 때마다 값을 기준으로 최소값이 가장 앞에
            // poll하면 나오게 정렬.
            //System.out.println(n);
        }

        // 입력이 끝났으므로 Scanner 객체를 닫음
        sc.close();

        int answer = 0; // 전체 섞은 횟수

        // A, B -> A+B. -> ... -> 1개
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            //System.out.println("a : " + a + " b : " + b);
            answer += (a + b);
            pq.add(a + b);
        }
        System.out.println(answer);
    }
}