import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        if(a+b+c+d >= n*4) {
            System.out.print(0);
        } else {
            System.out.print(n*4-(a+b+c+d));
        }
    }
    
}