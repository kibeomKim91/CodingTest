class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int sum = 0;
        int index = 0;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] > sum) {
                sum = array[i];
                index = i;
            }
        }        
        
        answer[0] = sum;
        answer[1] = index;
        
        return answer;
    }
}