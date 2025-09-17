import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		int inputs[] = new int[5];
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ; i< 5; i++ ) {
			inputs[i] = sc.nextInt();
		}
		
		for(int i =0 ; i< 5; i++ ) {
			
			result += inputs[i]*inputs[i] ;
		}
		
		System.out.println(result%10);
		sc.close();
	}
}