class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if(ch >= '0' && ch <= '9') { // 숫자인 경우
                answer += ch - '0'; // char를 int로 변환하고 더함
            }
        }
        
        return answer;
    }
}