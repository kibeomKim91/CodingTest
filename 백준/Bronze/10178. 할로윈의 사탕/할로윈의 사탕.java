import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println("You get "+a/b+" piece(s) and your dad gets "+a%b+" piece(s).");
        }
    }
    
}