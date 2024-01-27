import java.lang.*;
import java.util.Scanner;

/*
알고리즘 특강 시간에 푼 문제입니다.

DP 문제 풀이의 목적은 2번 계산하지않는다...

P 배열 : 각각 샀을 때 price
DP 배열 : 최적의 price

P1 = DP1
P2 != DP2
...
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //구매하고자 하는 카드의 갯수
        int[] P = new int[N + 1]; //각 카드팩의 가격을 저장하는 배열

        for(int i = 1 ; i<=N ; i++) {
            P[i] = sc.nextInt(); // 카드팩의 가격 입력
        }

        //System.out.println(Arrays.toString(P));

        //문제풀이
        int[] dp = new int[N+1];
        for(int i = 1; i <=N; i++){
            //i개의 카드가 들어 있는..
            dp[i] = P[i]; //카드의 갯수가 일치하는 팩을 구매했을 때
            for(int j =1; j <= i; j++){
                //i개를 구매하는데 있어서
                //j개는 팩을 까고, 나머지는 이전의 최소비용을 더해줌
                // dp[i]에 해당 조합당의 최소값을 계속 업데이트
                dp[i] = Math.min(dp[i], P[j] + dp[i-j]);
            }
            //System.out.println(Arrays.toString(dp));
        }
        System.out.println(dp[N]);
        sc.close();
    }
}

