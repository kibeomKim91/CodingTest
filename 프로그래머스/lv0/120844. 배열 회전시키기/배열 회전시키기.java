class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int numbersLength = numbers.length;
        
        if(direction.equals("right")) {
            for(int i=0; i<numbersLength; i++) {
                if(i == 0) {
                    answer[i] = numbers[numbersLength-1];
                    continue;
                }                
                answer[i] = numbers[i-1];
            }
        } else if(direction.equals("left")) {
            for(int i=0; i<numbersLength; i++) {
                if(i == numbersLength-1) {
                    answer[i] = numbers[0];
                    continue;
                }                
                answer[i] = numbers[i+1];
            }
        }
        
        return answer;
    }
}