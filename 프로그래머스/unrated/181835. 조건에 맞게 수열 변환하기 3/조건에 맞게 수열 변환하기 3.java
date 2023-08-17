class Solution {
    public int[] solution(int[] arr, int k) {
        int arrLength = arr.length;
        int[] answer = new int[arrLength];
        
        for(int i=0; i<arrLength; i++) {
            if(k%2 == 1) {
                answer[i] = arr[i] * k;
            } else {
                answer[i] = arr[i] + k;
            }
        }
        
        return answer;
    }
}