import java.util.Scanner;
import java.lang.NumberFormatException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // scanner.nextLine을 통해서 입력 받은 문자열을 String으로 저장(사용자가 7 77 777 이렇게 입력한다)
        // 해결방법 : scanner.next를 nextLine으로 수정
        String input = scanner.nextLine();
        // 입력 받은 문자열을 array 로 만들기( 스페이스를 기준으로 array에 담는다)
        // split : 특정 문자를 기준으로 문자열을 나누어 배열(array)에 저장해서 리턴하는 함수
//        System.out.println("scanner로 입력 받은 것이 저장 잘 됐는지 확인 : " + input);
        String[] inputArr = input.split(" ");
//        System.out.println("split 성공");

        // String 을 long 타입으로 변경해서 객체를 생성
        long a =  Long.parseLong(inputArr[0]);
        long b =  Long.parseLong(inputArr[1]);
        long c =  Long.parseLong(inputArr[2]);


        System.out.println(a+b+c);
        scanner.close();
    }
}

