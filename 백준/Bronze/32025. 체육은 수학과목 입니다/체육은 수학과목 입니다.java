import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int result = Math.min(h, w) * 100 / 2;
        
        System.out.print(result);
    }
    
}