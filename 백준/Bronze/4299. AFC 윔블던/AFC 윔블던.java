import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int difference = sc.nextInt();
        int a = (sum + difference) / 2;
        int b = sum - a;
        
        if(b < 0 || a + b != sum || a - b != difference) {
            System.out.print(-1);
        } else {
            System.out.print(a + " " + b);            
        }
    }
    
}