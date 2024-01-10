import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        int score = Integer.parseInt(input);
        // 입력받은 score 에 대해서 0과 100 사이의 정수값을 입력 받았는지 확인하는 코드도 넣고 싶다.
        checkInput(score);

        // 1과 100사이의 정수값이 입력되면 A, B, C, D, F 점수를 매기는 함수를 만들고 싶다.
        checkScore(score);
    }
    
    private static void checkInput(int score) {
        if (score < 0 || score > 100) {
            System.exit(0); // 0보다 작거나 100보다 큰 정수가 입력되면 프로그램 종료
        }
    }
    //입력받은 정수에 대해 점수를 판별하는 메소드 정의
    //시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력
    private static void checkScore(int score) {
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

