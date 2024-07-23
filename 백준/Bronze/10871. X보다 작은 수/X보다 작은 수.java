import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //배열의 요소 갯수 N
        int N = Integer.parseInt(st.nextToken());
        //비교할 수 X
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];	

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < arr.length; i++) {
            //배열에 둘째 줄 수열입력
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 배열 요소와 X 비교
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < X){	
                bw.write(arr[i] + " ");	
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}