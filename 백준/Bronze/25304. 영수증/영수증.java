import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

/*
총금액(X)
물건 종류 수(N) -> 입력 받기(N+2줄 입력받기)? 계산 반복? (a * b 를 N번 반복)
물건의 가격(a) 갯수(b)

출력은 X 랑 계산값이 일치하면 Yest 아니면 No 출력

합계를 저장할 변수 필요

 */

public class Main {
    public static void main(String[] args) throws IOException{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer st;

       int X = Integer.parseInt(br.readLine());
       int N = Integer.parseInt(br.readLine());
       int sum = 0;

       for(int i = 0; i < N; i++){
           st = new StringTokenizer(br.readLine(), " ");
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           sum = a*b + sum;
       }
       //System.out.println(sum);
        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}