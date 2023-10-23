import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = a * (100 - b) / 100;
        
        if(c >= 100) {
            System.out.print(0);
        } else {
            System.out.print(1);
        }
    }
    
}