/*
2차원 배열의 크기 저장, 질문 갯수 저장 (quizNo)
StringTokenizer
2차원 배열 저장하는거 모르겠네.
2차원 구간 합배열 D[x][y]정의
===
N(배열크기) M(질문 수) 저장하기
for(N만큼 반복하기){
원본배열 저장
}

for(N만큼 반복하기) {
    for(N만큼 반복하기) {
        합 배열 저장하기
        D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
    }
}

for(M만큼 반복하기){
    질의 계산 및 출력하기
    결과 = D[x2][y2] - D[x1-1][y2] -D[x2][y-1] D[x1-1][y1-1];
}

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//처음 짠 코드
//public class Main004 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //첫줄입력
//        StringTokenizer st = new StringTokenizer(br.readLine());
//            int N = Integer.parseInt(st.nextToken());
//            int M = Integer.parseInt(st.nextToken());
//
//            int [][]prefixSum = new int[N][N];
//            int [][]arr = new int[N][N];
//
//            //2차원배열로 저장
//            //두번째줄 입력
//            for(int i=0; i<N; i++){
//            st = new StringTokenizer(br.readLine());
//                for(int j=0; j<N; j++) {
//                    arr[i][j]; //? 2차원 배열에 값 입력 하는 방법은 뭐지요?
//                    prefixSum[i][j] = prefixSum[i][j-1] + prefixSum[i-1][j] - prefixSum[i-1][j-1] + arr[i][j];
//                }
//            }
//
//            // 구간 입력 받기 + 2차원배열의 구간합 출력하기
//            //2차원 구간합 공식
//            //이렇게 작성하면 변수의 데이터형식을 확인하러 한번더 올라가야되니깐 비추
//            int x1;
//            int x2;
//            int y1;
//            int y2;
//
//            for(int i=0; i<M; i++){
//                st = new StringTokenizer(br.readLine());
//                x1 = Integer.parseInt(st.nextToken());
//                y1 = Integer.parseInt(st.nextToken());
//                x2 = Integer.parseInt(st.nextToken());
//                y2 = Integer.parseInt(st.nextToken());
//
//                System.out.println( prefixSum[x2][y2]-prefixSum[x2][y1-1]-prefixSum[x1-1][y2]+prefixSum[x1-1][y1-1] );
//
//            }
//    }
//}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        //한줄 입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //원본배열 저장하기 (배열 크기 주의)
        // 원본배열 생성부터 배열크기 N+1
        int [][] Arr = new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            //한줄 입력을 다 받고, j가 1씩 증가할 때마다 j열의 값을 입력해줘야하므로
                st = new StringTokenizer(br.readLine()); //왜 이 위치에 있어야하지?-> 한줄 전체를 받아와서 j를 nextToken으로 잘라서 저장
            for(int j=1; j<=N; j++) {
                // 2 3 4 5 입력 한 줄이 -> 배열의 1줄이 됨 0,0 0,1 0,3 0,3 ..의 원소가 됨
                Arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //합배열 완성하기 (배열 크기 주의)
        int [][] D = new int [N+1][N+1];
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                D[i][j] = D[i-1][j] + D[i][j-1] - D[i-1][j-1] + Arr[i][j];
            }
        }

        //구간합 완성하기
        //반복문 내부에서만 사용할 변수는 반복문 내부에 선언하는 것을 권장!
            for(int i=0; i<M; i++){
                st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());

                System.out.println( D[x2][y2]-D[x2][y1-1]-D[x1-1][y2]+D[x1-1][y1-1] );
    }
}}

//