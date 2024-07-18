import java.io.*;
import java.lang.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       String X = st.nextToken();
       String Y = st.nextToken();
       String ans = Rev(String.valueOf(
               Integer.parseInt(Rev(X)) + Integer.parseInt(Rev(Y))));

        System.out.println(ans);
    }

   static String Rev(String num){
        char[] temp = num.toCharArray();
        String result = "";
        boolean firstZero = true;
        //뒤에서 부터 탐색
        for(int i = temp.length-1; i>=0 ; i--) {
            char now = temp[i];
            if(now == '0' && firstZero)continue;
            firstZero = false;
            result += String.valueOf(now);

        }

        return result;
    }

}