import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            double c = 0;
            if(a >= b) {
                c = a-b;
            } else {
                c = b-a;
            }
            
            c = Math.round(c * 10) / 10.0;
            System.out.printf("%.1f\n", c);
        }
    }
    
}