import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
같은 눈 3개가 나오면 10,000 + 같은눈*1000
같은 눈 2개

방법1. 처음 입력 받은 배열을 사용
// if 문 A[0] == A[1] == [A2]


방법2. 배열을 큰수로 정렬한 뒤에 새로운 배열로 사용(선택)
if(A[0] == A[1]){
    if(A[1] == A[2]){
        10000 +A[0]*1000
    }1000 + A[0]*100
} else if(A[1] == A[2]){
1000 + A[0]*100
} else {
    A[0] * 100
 }
 */


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[3];
        int result = 0;

        // 입력
        for (int i = 0; i < 3; i++) {
            //for문 돌때마다 A생성 및 저장
            A[i] = sc.nextInt();
        }

        Integer B[] = Arrays.stream(A).boxed().toArray(Integer[]::new);

        // 정렬, 내림차순으로 정렬을 하려니 int 요소들을 Integer로 바꿔줘야함.
        Arrays.sort(B, Comparator.reverseOrder());
        //System.out.println(B[0] + " " + B[1] + " " + B[2]);

        //비교
        if (B[0] == B[1] && B[1] == B[2]) {
                result = 10000 + B[0] * 1000;
        } else if (B[0] == B[1] || B[1] == B[2]) {
            result = 1000 + B[1] * 100;
        } else {
            result = B[0] * 100;
        }
        System.out.println(result);;

        sc.close();
    }
}
