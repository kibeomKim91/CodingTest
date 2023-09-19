class Solution {
    public String solution(String rny_string) {
        String answer = "";
        int rny_string_length = rny_string.length();
        
        for(int i=0; i<rny_string_length; i++) {
            if(rny_string.charAt(i) != 'm') {
                answer += rny_string.charAt(i);
            } else {
                answer += "rn";
            }
        }
        
        return answer;
    }
}