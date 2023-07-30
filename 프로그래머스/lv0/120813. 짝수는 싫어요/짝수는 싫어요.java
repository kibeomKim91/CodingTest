class Solution {
    public int[] solution(int n) {
        int num = n-n-1;
        int[] answer = new int[n/2+n%2];
        for (int i = 0; i < n/2+n%2; i++) {
            answer[i] = i*2+1;
        }
        
        return answer;
    }
}