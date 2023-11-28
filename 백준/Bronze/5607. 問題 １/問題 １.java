import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aScore = 0;
        int bScore = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a>b) {
                aScore += a+b;
            } else if(b>a) {
                bScore += a+b;
            } else {
                aScore += a;
                bScore += b;
            }
        }
        
        System.out.print(aScore+" "+bScore);
    }
    
}