public class Solution {
    public int solution(String num_str) {
        int sum = 0;

        // 문자열의 각 문자를 순회
        for (char ch : num_str.toCharArray()) {
            sum += ch - '0';  // 문자를 정수로 변환 후 합계에 더함
        }

        return sum;
    }
}