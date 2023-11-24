import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(num == 1) {
                a++;
            } else {
                b++;
            }
        }
        
        if(a <= b) {
            System.out.print(a);
        } else {
            System.out.print(b);
        }
    }
    
}