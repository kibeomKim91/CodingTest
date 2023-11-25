import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == b) {
            System.out.print(k*k);
        } else {
            double d = (double) (a-b)/2;
            double hh = k*k - d*d;
            System.out.print(hh);
        }
    }
    
}