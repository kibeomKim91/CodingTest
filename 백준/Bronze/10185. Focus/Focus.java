import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();            
            double d = (double) a*b/(a+b);
            
            System.out.printf("f = %.1f\n", d);
        }
    }
    
}
