import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int low = 0;
        int high = 0;
        
        if(a >= b) {
            low = b;
            high = a;
        } else {
            low = a;
            high = b;
        }
        
        if(c*2 <= low && low*2 >= high) {
            System.out.print("good");
        } else {
            System.out.print("bad");
        }
    }
    
}