import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            double d = sc.nextDouble();
            
            if(d == -1.0) {
                break;
            }
            
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", d, d*0.167);
        }
    }
    
}