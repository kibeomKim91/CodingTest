import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength  = str.length();
        char copy = '0';
        
        for(int i=0; i<strLength; i++) {
            char ch = str.charAt(i);
            
            if(ch != copy || i == 0) {
                System.out.print(ch);
                copy = ch;
            }
        }
    }
    
}