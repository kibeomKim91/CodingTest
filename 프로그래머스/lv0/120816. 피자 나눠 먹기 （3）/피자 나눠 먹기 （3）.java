class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        
        for (int i=0; i<n; i++) {
            if (slice/n == 0) {
                slice = slice + slice / (i+1);
                answer ++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}