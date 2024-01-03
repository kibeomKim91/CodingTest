import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int b = sc.nextInt();
        int y = sc.nextInt();
        int c = sc.nextInt();
        int z = sc.nextInt();
        
        if(a == b) {
            System.out.print(c+" ");
        } else if(a == c) {
            System.out.print(b+" ");
        } else if(b == c) {
            System.out.print(a+" ");
        }
        
        if(x == y) {
            System.out.print(z);
        } else if(x == z) {
            System.out.print(y);
        } else if(y == z) {
            System.out.print(x);
        }
    }
    
}