class Solution {
    public int[] solution(int[] arr) {
        int answerLength = 0;
        int index = 0;
        
        for(int num : arr) {
            answerLength += num;
        }
        
        int[] answer = new int[answerLength];
        
        for(int num : arr) {
            for(int i=0+index; i<num+index; i++) {
                answer[i] = num;
            }
            index += num;
        }
        
        return answer;
    }
}