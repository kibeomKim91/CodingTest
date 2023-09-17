class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        int my_string_length = my_string.length();
        
        for(int i=0; i<my_string_length; i++) {
            if(i != num1 && i != num2) {
                answer += my_string.charAt(i);
            } else if(i == num1) {
                answer += my_string.charAt(num2);
            } else if(i == num2) {
                answer += my_string.charAt(num1);
            }
        }
        
        return answer;
    }
}