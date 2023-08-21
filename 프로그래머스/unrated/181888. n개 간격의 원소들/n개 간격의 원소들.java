class Solution {
    public int[] solution(int[] num_list, int n) {
        int num_list_length = num_list.length;
        int arr_length = 0;        
        
        if(num_list_length % n != 0) {
            arr_length = num_list_length / n + 1;
        } else if (num_list_length % n == 0) {
            arr_length = num_list_length / n;
        }
        
        int[] arr = new int[arr_length];
        
        for(int i = 0; i < arr_length; i++) {
            arr[i] = num_list[i * n];
        }
        
        return arr;
    }
}