import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n <= 30) {
            System.out.print(n/2.0);
        } else {
            System.out.print((n-30)*1.5+15);
        }
    }
    
}