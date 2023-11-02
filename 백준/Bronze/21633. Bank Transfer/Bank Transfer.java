import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = n/100.0 + 25;
        
        if(d < 100) {
            d = 100.00;
        } else if(d > 2000) {
            d = 2000.00;
        }
        
        System.out.printf("%.2f", d);
    }
    
}