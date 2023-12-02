import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = (double) n/2;
        
        System.out.print(Math.round(d*d));
    }
    
}