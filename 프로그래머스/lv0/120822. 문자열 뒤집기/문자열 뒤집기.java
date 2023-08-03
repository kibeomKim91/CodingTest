class Solution {
    public String solution(String my_string) {
        
        String reverse_my_string = "";
        int my_string_length = my_string.length();
        
        for(int i=0; i<my_string_length; i++) {
            reverse_my_string += my_string.charAt(my_string_length-1-i);
        }
        
        return reverse_my_string;
    }
}