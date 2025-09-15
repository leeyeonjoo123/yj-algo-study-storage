import java.util.*;

public class Main {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner (System.in);
		String scInput = sc.nextLine();
		String answer = "";
		
		for(int i = 0; i < scInput.length(); i++) {
			char scChar = scInput.charAt(i);
			if(Character.isUpperCase(scChar)) {
				answer += Character.toLowerCase(scChar);
			}
			else	answer += Character.toUpperCase(scChar);
		}

		System.out.println(answer);
		
	}

}