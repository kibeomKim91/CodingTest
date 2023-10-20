import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int score = 50*a - 10*b;
        
        if(a > b) {
            score += 500;
        }
        
        System.out.print(score);
    }
    
}