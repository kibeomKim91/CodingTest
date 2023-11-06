import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long one = sc.nextLong();
        long two = sc.nextLong();
        long three = sc.nextLong();
        
        a = a*b;
        x = x*y;
        one = one*two*three;
        
        System.out.print((a+x)*one);
    }
    
}