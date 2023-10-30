import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a == b && b == c) {
            System.out.print(2);
        } else if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
    
}