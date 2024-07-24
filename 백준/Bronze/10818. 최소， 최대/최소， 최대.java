import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //배열의 요소 갯수 N
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < arr.length; i++) {
            //배열에 둘째 줄 수열입력
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0];
        int max = arr[0];
        // arr[0]와 다음 인덱스값 비교
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        bw.write(min + " " + max);
        br.close();
        bw.flush();
        bw.close();
    }
}