import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n*5-400 > 100) {
            System.out.println(n*5-400);
            System.out.println(-1);
        } else if(n*5-400 == 100) {
            System.out.println(n*5-400);
            System.out.println(0);
        } else {
            System.out.println(n*5-400);
            System.out.println(1);
        }
    }
    
}