import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        StringBuilder sb = new StringBuilder(3);
        
        for(int i=0; i<strLength; i++) {            
            sb.append(str.charAt(strLength-1-i));
        }
        
        System.out.print(sb.toString());
    }
    
}