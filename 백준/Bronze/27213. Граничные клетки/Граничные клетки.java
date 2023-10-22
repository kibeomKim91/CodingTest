import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        if(m == 1 && n == 1) {
            System.out.print(1);
        } else if(m == 1) {
            System.out.print(n);
        } else if(n == 1) {
            System.out.print(m);
        } else {
            System.out.print(m*2 + n*2 - 4);
        }
    }
    
}