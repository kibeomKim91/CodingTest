class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        int answer_length = answer.length;
        for(int i=0; i<answer_length; i++) {
            if(start >= end) {
                answer[i] = start;
                start--;
            }            
        }
        
        return answer;
    }
}