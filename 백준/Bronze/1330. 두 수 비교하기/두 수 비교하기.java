import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //방법 1. split 을 이용해서 구분
        String [] inputs = bf.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        //삼항연산자를 사용해서 비교
        System.out.println(a > b ? ">" : (a < b ? "<" : "=="));

    }
}
