import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt()-x;
            int b = sc.nextInt()-y;            
            double c = Math.sqrt(a*a+b*b);
            
            if(c>k) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}