import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(true) {
            if(n%2 == 0) {
                System.out.print(n);
                break;
            } else {
                n -= n / 2;
            }
        }
    }
    
}