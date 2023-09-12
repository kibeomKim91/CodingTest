class Solution {
    public String solution(String rsp) {
        String answer = "";
        int rspLength = rsp.length();
        
        for(int i=0; i<rspLength; i++) {
            if(rsp.charAt(i) == '0') {
                answer += "5";
            } else if(rsp.charAt(i) == '2') {
                answer += "0";
            } else {
                answer += "2";
            }
        }
        
        return answer;
    }
}