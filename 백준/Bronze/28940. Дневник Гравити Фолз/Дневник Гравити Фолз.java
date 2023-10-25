import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(b > x || c > y) {
            System.out.print(-1);
        } else {
            if(a % ((x/b) * (y/c)) == 0) {
                System.out.print(a / ((x/b) * (y/c)));
            } else {
                System.out.print(a / ((x/b) * (y/c)) + 1);
            }
        }
    }
    
}