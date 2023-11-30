import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int s = 0;
        int t = 0;
        
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 's') {
                s++;
            } else {
                t++;
            }
        }
        
        for(int i=0; i<n-1; i++) {
            if(s == t) {
                System.out.print(str.substring(i));
                break;
            }
            
            if(str.charAt(i) == 's') {
                s--;
            } else {
                t--;
            }    
        }
    }
    
}