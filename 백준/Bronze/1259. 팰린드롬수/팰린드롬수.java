import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String number = br.readLine();
            if(number.equals("0"))
                break;
            if(isP(number)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
    
    private static boolean isP(String number){
        char[] number_text = number.toCharArray();
        int start_index = 0;
        int end_index = number_text.length-1;
        while(start_index <= end_index){
            if(number_text[start_index] != number_text[end_index]){
                return false;
            }
            start_index++;
            end_index--;
        }
        return true;
    }
}