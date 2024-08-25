import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<m; j++) {
                System.out.print('*');
            }
            
            for(int j=0; j<(n-m)*2; j++) {
                System.out.print(' ');
            }
            
            for(int j=0; j<m; j++) {
                System.out.print('*');
            }
            
            m++;
            System.out.println();
        }
        
        for(int i=0; i<n*2; i++) {
            System.out.print('*');
        }
        
        for(int i=0; i<n-1; i++) {
            System.out.println();
            m--;
            
            for(int j=0; j<m; j++) {
                System.out.print('*');
            }
            
            for(int j=0; j<(n-m)*2; j++) {
                System.out.print(' ');
            }
            
            for(int j=0; j<m; j++) {
                System.out.print('*');
            }
        }
    }
    
}