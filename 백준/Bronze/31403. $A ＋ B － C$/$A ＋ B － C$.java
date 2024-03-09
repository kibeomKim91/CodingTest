import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 0;
        
        if(b < 1000 && b >= 100) {
            d = a * 1000 + b;
        } else if(b < 100 && b >= 10) {
            d = a * 100 + b;
        } else if(b < 10) {
            d = a * 10 + b;
        } else {
            d = a * 10000 + b;
        }
        
        System.out.println(a + b - c);
        System.out.println(d - c);
    }
    
}