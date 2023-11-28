import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int count = 0;
        
        if(n > 198) {
            System.out.print(0);
            return;
        } else {
            if(n%2 == 1) {
                a = n/2;
                b = n/2 + 1;
            } else {
                a = n/2;
                b = n/2;
            }
        }
        
        for(int i=a+b; i<199; i++) {
            count++;
        }
        
        System.out.print(count);
    }
    
}