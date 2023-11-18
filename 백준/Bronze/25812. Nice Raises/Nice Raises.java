import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int oneCount = 0;
        int twoCount = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(num < m) {
                oneCount++;
            } else if(num > m) {
                twoCount++;
            }
        }
        
        if(oneCount > twoCount) {
            System.out.print(1);
        } else if(twoCount > oneCount) {
            System.out.print(2);
        } else {
            System.out.print(0);
        }
    }
    
}