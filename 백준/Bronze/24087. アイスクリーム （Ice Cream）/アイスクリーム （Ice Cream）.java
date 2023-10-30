import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = 0;
        
        if(a <= b) {
            System.out.print(250);
            return;
        }
        
        if((a-b)%c == 0 && a-b > 0) {
            n = (a-b)/c;
        } else {
            n = (a-b)/c+1;
        }
        
        System.out.print(250+100*n);
    }
    
}