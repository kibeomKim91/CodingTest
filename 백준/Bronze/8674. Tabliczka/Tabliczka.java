import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        if(a == 1 && b == 1) {
            System.out.print(1);
        } else if(a%2 == 0 || b%2 == 0) {
            System.out.print(0);
        } else {
            if(a >= b) {
                System.out.print(b);
            } else {
                System.out.print(a);
            }
        }
    }
    
}