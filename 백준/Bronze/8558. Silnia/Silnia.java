import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n >= 5) {
            System.out.print(0);
        } else {
            if(n == 4) {
                System.out.print(4);
            } else if(n == 3) {
                System.out.print(6);
            } else if(n == 2) {
                System.out.print(2);
            } else {
                System.out.print(1);
            }
        }
    }
    
}