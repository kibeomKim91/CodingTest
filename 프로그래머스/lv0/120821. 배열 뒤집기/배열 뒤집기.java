class Solution {
    public int[] solution(int[] num_list) {
        
        int arrayLength = num_list.length;
        int[] reverse_num_list = new int[arrayLength];
        
        for(int i=0; i<arrayLength; i++) {
            reverse_num_list[i] = num_list[arrayLength-1-i];
        }
        
        return reverse_num_list;
    }
}