import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        char copy = '0';
        String result = "";
        
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i) != copy) {
                result += str.charAt(i);
                copy = str.charAt(i);
            }
        }
        
        System.out.print(result);
    }
    
}