import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 첫줄, 배열의 크기 n을 입력 받음
        int n = sc.nextInt();
        
        // 두번째줄로 배열 만들기
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //세번째줄 정수 v 입력 받음
        int v = sc.nextInt();
        int cnt = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == v)
                cnt++;
        }
        System.out.println(cnt);
    }
}