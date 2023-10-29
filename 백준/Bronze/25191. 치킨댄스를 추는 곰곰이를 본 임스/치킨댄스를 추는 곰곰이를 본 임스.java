import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(b/2+c >= a) {
            System.out.print(a);
        } else {
            System.out.print(b/2+c);
        }
    }
    
}