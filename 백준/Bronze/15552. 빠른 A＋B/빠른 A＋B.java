import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       // StringTokenizer가 BufferREader 보다 빠르게 사용될 수 있다.
       StringTokenizer st; //공백이 있다면 뒤에 문자열이 공백 자리를 땡겨채우도록 한다.

       int T = Integer.parseInt(br.readLine()); // 한줄 단위로 입력 받음 그래서 마지막줄 입력이 안먹히나? 엔터가 없어서?
//       int sum = 0;

//       int A = 0;
//       int B = 0;

       for(int i = 0; i < T; i++){
           st = new StringTokenizer(br.readLine(), " "); //공백 단위로 데이터를 가공할 때
//           A = Integer.parseInt(st.nextToken());
//           B = Integer.parseInt(st.nextToken());

           bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");

//           System.out.println(A+B);
//           bw.write(A + B);

       }
       bw.flush();
       bw.close();
    }
}