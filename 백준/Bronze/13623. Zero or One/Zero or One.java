import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        sc.close();
        
        if(a+b+c == 1 || a+b+c == 2) {
            if(a == b) {
                System.out.print('C');
            } else if(a == c) {
                System.out.print('B');
            } else if(b == c) {
                System.out.print('A');
            }
        } else {
            System.out.print('*');
        }
    }
    
}