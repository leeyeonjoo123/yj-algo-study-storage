import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQueue = new LinkedList<>();
		
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) { //카드가 1부터 시작 
			myQueue.add(i); // 1부터 N까지 queue로 쌓기
		}
		while(myQueue.size()>1) { //카드가 1장 남을 때 까지 반복
			myQueue.poll(); // 맨위 카드 버림
			int temp = myQueue.poll(); // 맨 위 카드 저장
			myQueue.add(temp); // 저장한 카드 맨 아래로 추가
		}
		System.out.println(myQueue.poll()); // 그냥 myQueue만 출력하면 배열로 출력되어서 틀림
	}
}