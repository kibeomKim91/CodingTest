import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print((n-n*22/100) + " " + (n-n*2/10*22/100));
    }
    
}