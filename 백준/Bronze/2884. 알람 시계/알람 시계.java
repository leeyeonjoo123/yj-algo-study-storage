import java.io.*;

public class Main {
    private static final int LAST_TIME = 23;
    private static final int LAST_MIN = 59;
    private static final int CAL_MIN = 45;
    private static final int QUE_MIN = 15;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int H = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        // 입력 조건 만족하는지 확인
        checkInput(H, M);

        
            // if문 안에 로직이 중복되고, System.out.println 내용도 중복이라서 수정하고 싶다
            if (H > 0) {
                if ( (CAL_MIN <= M) && (M <=LAST_MIN )) {
                    int m = M-CAL_MIN;
                    System.out.println(H + " " + m );

                } else {
                    int h = H-1;
                    int m = M+QUE_MIN;

                    System.out.println(h + " " + m );

                }
            } else if (H == 0) {
                if ( (CAL_MIN <= M) && (M <=LAST_MIN )) {
                    int m = M-CAL_MIN;

                    System.out.println(H + " " + m );

                } else {
                    int h = LAST_TIME;
                    int m = M+QUE_MIN;

                   System.out.println(h + " " + m );

                }

            }
        // BufferedReader 의 경우, close() 메소드를 명시하지 않아도, GC가 정리해준다.
    }


    // 입력 조건에 맞지 않은 값이 입력되면 프로그램 종료
    private static void checkInput(int H, int M) {
        if ((H < 0 || H > LAST_TIME) || (M < 0 || M > LAST_MIN)) {
            System.exit(0);
        }
    }
}