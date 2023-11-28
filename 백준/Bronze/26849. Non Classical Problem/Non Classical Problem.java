import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        double max = 0;
        double min = 0;
        
        for(int i=0; i<n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            sum += a/b;
            
            if(a/b > max) {
                max = a/b;
            }
            
            if(i == 0) {
                min = a/b;
            } else {
                if(min > a/b) {
                    min = a/b;
                }
            }
        }
        
        System.out.printf("%.11f %.11f %.11f", min, max, sum);
    }
    
}