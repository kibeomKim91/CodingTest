import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 1. 모두 소문자로 변환
        my_string = my_string.toLowerCase();
        
        // 2. 문자열을 문자 배열로 변환
        char[] charArray = my_string.toCharArray();
        
        // 3. 문자 배열을 알파벳 순서로 정렬
        Arrays.sort(charArray);
        
        // 4. 문자 배열을 문자열로 다시 변환
        String answer = new String(charArray);
        
        return answer;
    }
}