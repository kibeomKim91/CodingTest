import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a >= 20) {
            System.out.print(b+24-a);
        } else {
            System.out.print(b-a);
        }
    }
    
}