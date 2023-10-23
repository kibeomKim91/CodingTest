import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fastTime = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a <= b) {
                if(fastTime == 0 || fastTime > b) {
                    fastTime = b;
                }
            }
        }
        
        if(fastTime == 0) {
            System.out.print(-1);
        } else {
            System.out.print(fastTime);
        }
    }
    
}