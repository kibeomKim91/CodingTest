import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        int count = 0;
        
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i) == 'D' && i+3 < strLength) {
                if(str.charAt(i+1) == 'K' && str.charAt(i+2) == 'S' && str.charAt(i+3) == 'H') {
                    count++;
                }
            }
        }
        
        System.out.print(count);        
    }
    
}