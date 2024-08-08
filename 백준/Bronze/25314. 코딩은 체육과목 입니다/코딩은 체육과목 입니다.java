import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
입력 받은 숫자 N
N/4 번 만큼 long 반복 출력 + 무조건 뒤에 int
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String result = "";

            int N = sc.nextInt();
            for(int i = 0 ; i < N/4 ; i++ ){
                result = "long";
            System.out.printf(result+ " ");
            }
        System.out.printf("int");
        sc.close();
    }
}
