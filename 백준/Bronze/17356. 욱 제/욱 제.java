import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        double m = (double) (b-a) / 400;
        double result = 1 / (1 + Math.pow(10, m));
        
        System.out.print(result);
    }
    
}