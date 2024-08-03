import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //5

        for(int i=0; i<N; i++){ // i 1
            for(int j=N-(i+1); j>0 ; j--){ //j 5
                System.out.print(" "); // 4 3 2 1
            }
            for(int j=0 ; j<=i; j++){ //j 0 01 0123
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
