import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        for(int i=0; i<n; i++) {
            System.out.println((n-i)*(i+1));
        }
    }
    
}