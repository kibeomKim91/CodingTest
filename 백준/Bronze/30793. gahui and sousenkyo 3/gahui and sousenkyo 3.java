import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = (double) a/b;
        
        if(result < 0.2) {
            System.out.print("weak");
        } else if(result >= 0.2 && result < 0.4) {
            System.out.print("normal");
        } else if(result >= 0.4 && result < 0.6) {
            System.out.print("strong");
        } else {
            System.out.print("very strong");
        } 
    }
    
}