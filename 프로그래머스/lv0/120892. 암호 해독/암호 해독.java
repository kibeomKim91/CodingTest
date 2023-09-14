class Solution {
    public String solution(String cipher, int code) {
        int count = 0;
        String answer = "";
        int cipherLength = cipher.length();
        
        for(int i=0; i<cipherLength; i++) {
            if(count == code-1) {
                answer += cipher.charAt(i);
                count = 0;
            } else {
                count++;
            }            
        }
        
        return answer;
    }
}