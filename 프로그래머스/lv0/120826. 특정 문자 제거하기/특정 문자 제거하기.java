class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        int my_string_Length = my_string.length();
        
        for(int i=0; i<my_string_Length; i++) {
            if(my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}