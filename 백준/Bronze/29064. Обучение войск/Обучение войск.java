import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int half = 0;
        int count = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(num == 1) {
                count++;
            }
        }
        
        if(n%2 == 1) {
            half = n/2+1;
        } else {
            half = n/2;
        }
        
        if(half > count) {
            System.out.print(half-count);
        } else {
            System.out.print(0);
        }
    }
    
}