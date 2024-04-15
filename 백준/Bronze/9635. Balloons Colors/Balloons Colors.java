import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int easy = 0;
            int hard = 0;
            
            for(int j=0; j<n; j++) {
                int num = sc.nextInt();
                
                if(j == 0 && num == x) {
                    easy++;
                }
                
                if(j == n-1 && num == y) {
                    hard++;
                }
            }
            
            if(easy == 1 && hard == 1) {
                System.out.println("BOTH");
            } else if(easy == 1) {
                System.out.println("EASY");
            } else if(hard == 1) {
                System.out.println("HARD");
            } else {
                System.out.println("OKAY");
            }
        }
    }
    
}