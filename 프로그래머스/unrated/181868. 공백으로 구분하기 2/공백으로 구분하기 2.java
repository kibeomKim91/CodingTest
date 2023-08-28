class Solution {
    public String[] solution(String my_string) {
        // 문자열의 앞뒤 공백을 제거
        my_string = my_string.trim();
        
        // 하나 이상의 공백을 기준으로 문자열을 분리
        String[] answer = my_string.split("\\s+");
        
        return answer;
    }
}