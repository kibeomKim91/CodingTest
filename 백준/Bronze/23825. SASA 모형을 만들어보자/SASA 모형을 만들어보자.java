import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a/2 >= b/2) {
            System.out.print(b/2);
        } else {
            System.out.print(a/2);
        }
    }
    
}