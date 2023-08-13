class Solution {
    public int[] solution(int[] num_list, int n) {
        int num_list_length = num_list.length;
        int[] arr = new int[num_list_length-n+1];
        
        for (int i=0; i+n-1<num_list_length; i++) {
            arr[i] = num_list[i+n-1];
        }
        
        return arr;
    }
}