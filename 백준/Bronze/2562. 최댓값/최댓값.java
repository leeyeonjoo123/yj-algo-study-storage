import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int N = 9;
        int[] arr = new int[9];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int index = 0 ;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
        br.close();
    }
}