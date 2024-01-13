import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int max = 0;
        
        for(int i=1; i<=5; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            if(a+b+c+d > max) {
                num = i;
                max = a+b+c+d;
            }
        }
        
        System.out.print(num+" "+max);
    }
    
}