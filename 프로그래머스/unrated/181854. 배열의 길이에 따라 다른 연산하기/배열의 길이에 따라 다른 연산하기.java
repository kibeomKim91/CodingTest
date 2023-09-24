class Solution {
    public int[] solution(int[] arr, int n) {
        int[] array = new int[arr.length];
        
        if(arr.length % 2 == 1) {
            for(int i=0; i<arr.length; i++) {
                if(i % 2 == 0) {
                    array[i] = arr[i] + n;
                } else {
                    array[i] = arr[i];
                }
            }
        } else if(arr.length % 2 == 0) {
            for(int i=0; i<arr.length; i++) {
                if(i % 2 == 1) {
                    array[i] = arr[i] + n;
                } else {
                    array[i] = arr[i];
                }
            }
        }
        
        return array;
    }
}