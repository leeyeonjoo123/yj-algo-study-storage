import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //Buffer 로 입력 받으면 무조건 String
        String input = bf.readLine();

        //연산을 위해서 String -> int 로 형변환
        int year = Integer.parseInt(input);

        //입력받은 year에 대해서 1과 4000사이의 자연수가 맞는지 확인하는 함수
        checkInput(year);

        //윤년인지 아닌지 확인 하는 함수
        checkYear(year);
    }

    // 입력 조건에 맞지않은 값이 입력되면 프로그램 종료
    private static void checkInput(int year) {
        if (year < 0 || year > 4000) {
            System.exit(0);
        }
    }

    //윤년인지 아닌지 확인하는 함수, if문의 참인 조건(괄호) 안에는 윤년인이 아닌 경우를 true로 한다.
    private static void checkYear(int year) {
        if ( year % 4 != 0) { // 4의 배수가 아니라면
            System.out.println("0"); // 윤년이 아니다 0 출력
        } else if ( year % 100 == 0 && year % 400 !=0) { // 100의 배수 이고  400의 배수가 아니면 윤년이 아니다
            System.out.println("0");
        } else {
            System.out.println("1"); // 그래서 모든 조건을 만족하지 않으면 윤년이다.
        }
    }
}
