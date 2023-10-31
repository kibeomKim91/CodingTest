import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            double d = sc.nextDouble();
            
            if(d == 0) {
                break;
            }
            
            d = 1 + d + d*d + d*d*d + d*d*d*d;
            System.out.printf("%.2f\n", d);
        }
    }
    
}