import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        
        double a = (double) 100 / p;
        double b = (double) 100 / (100 - p);
        
        System.out.println(a);
        System.out.println(b);
    }
    
}