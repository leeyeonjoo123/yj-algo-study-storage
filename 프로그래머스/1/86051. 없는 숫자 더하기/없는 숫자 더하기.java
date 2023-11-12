class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] array = new int[10];
        
        for(int i=0; i<numbers.length; i++){
            array[numbers[i]] = 1;
        }
        
        for(int i=0; i<array.length; i++){
            if(array[i] == 0)
                answer += i;
        }
        return answer;
    }
}