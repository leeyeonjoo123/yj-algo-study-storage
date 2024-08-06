import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        // .hasNextInt() : 입력값이 정수면 trun 아니면 false
        while(sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            result = A + B;
            System.out.println(result);
            }
        sc.close();
    }
}
