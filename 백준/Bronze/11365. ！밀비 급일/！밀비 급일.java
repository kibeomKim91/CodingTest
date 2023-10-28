import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String str = sc.nextLine();
            
            if(str.equals("END")) {
                break;
            }
            
            int strLength = str.length();
            StringBuilder sb = new StringBuilder(strLength);
            
            for(int i=0; i<strLength; i++) {
                sb.append(str.charAt(strLength-1-i));
            }
            
            System.out.println(sb.toString());
        }
    }
    
}