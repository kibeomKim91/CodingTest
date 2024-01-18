import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boy = sc.nextInt();
        int girl = sc.nextInt();
        int result = 2 * Math.min(boy, girl);
        
        if((Math.max(boy, girl) - Math.min(boy, girl)) % 2 == 1) {
            result ++;
        }
        
        System.out.print(result);
    }
    
}