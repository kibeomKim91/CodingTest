import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double max = 0;
        
        for(int i=0; i<n; i++) {
            char ch = sc.next().charAt(0);
            double r = 0;
            double h = 0;
            double v = 0;
            
            if(ch == 'S') {
                r = sc.nextDouble();
                v = 4.0/3*3.14159*r*r*r;
            } else if(ch == 'C') {
                r = sc.nextDouble();
                h = sc.nextDouble();
                v = 1.0/3*3.14159*r*r*h;
            } else if(ch == 'L') {
                r = sc.nextDouble();
                h = sc.nextDouble();
                v = 3.14159*r*r*h;
            }
            
            if(v > max) {
                max = v;
            }
        }
        
        System.out.printf("%.3f", max);
    }
    
}