class Solution {
    public String solution(String my_string, int n) {
        
        String answer = "";
        int length = my_string.length();
        
        for(int i=0; i<length; i++) {
            for(int j=0; j<n; j++) {
                answer += my_string.charAt(i);
            }
        }        
        
        return answer;
    }
}