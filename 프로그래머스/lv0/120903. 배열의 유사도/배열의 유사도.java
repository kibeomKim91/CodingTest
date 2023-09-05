class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String oneStr : s1) {
            for(String twoStr : s2) {
                if(oneStr.equals(twoStr)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}