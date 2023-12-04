class Solution {
    
    public int solution(int a, int b) {
        String str = ""+a+b;
        int x = Integer.parseInt(str);
        int y = 2*a*b;
        
        if(x>=y) {
            return x;
        } else {
            return y;
        }
    }
    
}