class Solution {
    public int solution(int hp) {
        int answer = 0;
        int num = 0;
        
        answer += hp/5;
        num = hp%5;
        
        answer += num/3;
        num %= 3;
        
        answer += num;
            
        return answer;
    }
}