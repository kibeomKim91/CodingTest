class Solution {
    public int solution(String myString, String pat) {
        // myString에서 A를 B로, B를 A로 변환
        StringBuilder convertedString = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c == 'A') convertedString.append('B');
            else if (c == 'B') convertedString.append('A');
        }

        // 변환된 문자열에서 pat이 포함되어 있는지 확인
        String converted = convertedString.toString();
        if (converted.contains(pat)) return 1;
        else return 0;
    }
}