import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(true) {
            char ch = sc.next().charAt(0);            
            if(ch == '=') {
                break;
            }
            
            int num = sc.nextInt();
            if(ch == '+') {
                n += num;
            } else if(ch == '-') {
                n -= num;
            } else if(ch == '*') {
                n *= num;
            } else {
                n /= num;
            }
        }
        
        System.out.print(n);
    }
    
}