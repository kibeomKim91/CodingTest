import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int win = n;
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            int strLength = str.length();
            
            for(int j=0; j<strLength-1; j++) {
                if(str.charAt(j) == 'C' && str.charAt(j+1) == 'D') {
                    win--;
                    break;
                }
            }
        }
        
        System.out.print(win);
    }
    
}