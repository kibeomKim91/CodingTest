import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num : numlist) {
            if(num % n == 0) {
                arr.add(num);
            }
        }
        
        int[] result = new int[arr.size()];
        
        for(int i=0; i<arr.size(); i++) {
            result[i] = arr.get(i);
        }
        
        return result;
    }
}