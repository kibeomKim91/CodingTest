class Solution {
    public double solution(int[] numbers) {
        double addSum = 0;
        
        for (int i=0; i<numbers.length; i++) {
            addSum += numbers[i];
        }
        
        return addSum / numbers.length;
    }
}