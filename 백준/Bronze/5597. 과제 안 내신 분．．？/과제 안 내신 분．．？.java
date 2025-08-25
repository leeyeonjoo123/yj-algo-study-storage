
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받은 숫자를 인덱스로 총 30명이니 크기가 30인 배열 생성 
        // 초기화를 안해주면 int 배열은 초기값을 0으로 가짐
        int[] arr = new int[30];
        int inputNum = 28; //입력받을 숫자는 28개

        for (int i = 0; i < inputNum; i++) {
            int index = scanner.nextInt();
            arr[index - 1] = 1; // index는 0부터 시작하니 -1 , 입력받은 숫자 index 의 배열값은 1로 초기화
        }
        // 입력받은 숫자의 인덱스 위치에 있는 값들은 1, 아니면 0으로 배열이 채워짐
        // 0인 값 찾기
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 1){   
                System.out.println(i+1);
            }
        }
    }
}