class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String str = "abcdefghij";

        while (age > 0) {
            int remainder = age % 10;
            answer.insert(0, str.charAt(remainder));
            age /= 10;
        }

        return answer.toString();
    }
}