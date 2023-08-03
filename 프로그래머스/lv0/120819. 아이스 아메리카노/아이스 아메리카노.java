class Solution {
    public int[] solution(int money) {
        
        int americanoCup = money/5500;
        int extraMoney = money%5500;
        
        int[] answer = {americanoCup, extraMoney};
        
        return answer;
    }
}