import java.util.*;
import java.io.*;
/*
알고리즘 특강 시간에 푼 문제입니다.
*/
public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 연산의 개수 N을 입력 받음
        int N = sc.nextInt();
        
        //절대값 힙 구현을 위해 우선순위 큐를 초기화
        //PriorityQueue<Integer> pq = new PriorityQueue<>(); // 기본옵션 : 오름차순이 우선순위
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (o1, o2) -> {
                    int abs1 = Math.abs(o1); // Math.abs( )JAVA에서 절댓값 나타내기
                    int abs2 = Math.abs(o2); // JAVA에서 절댓값 나타내기
                    if(abs1 == abs2) {
                        return o1 - o2;
                        // 0 -> 그대로 있고
                        // + -> o2, o1
                        // - -> o1, o2     자바가 셀렉하는 원리? (작은 값이 앞에옴)
                    }
                    return abs1 - abs2;
                    // + -> o2, o1
                    // - -> o1, o2  
                }
                
        );
        
        //N번의 연산을 수행
        for(int i = 0; i < N; i++){
            //정수 x를 입력받음
            int x = sc.nextInt();


            //풀이 시작
            if(x != 0) {
                pq.add(x);
                //euauenu
            } else if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                }else {
                    System.out.println(pq.poll()); 
                }
            }
        }

    }
}