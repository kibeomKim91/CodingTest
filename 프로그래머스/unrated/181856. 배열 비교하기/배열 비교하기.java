class Solution {
    
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length) {
            return 1;
        } else if(arr1.length < arr2.length) {
            return -1;
        }
        
        int sumA = 0;
        int sumB = 0;
        for(int i=0; i<arr1.length; i++) {
            sumA += arr1[i];
            sumB += arr2[i];
        }
        
        if(sumA > sumB) {
            return 1;
        } else if(sumA < sumB) {
            return -1;
        } else {
            return 0;
        }
    }
    
}