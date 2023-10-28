import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if(n > m) {
            System.out.print(m+m+1);
        } else {
            System.out.print(n+n-1);
        }
    }
    
}