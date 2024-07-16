import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int count  = 0;
            
            for(int j=0; j<n; j++) {
                a[j] = sc.nextInt();
            }
            
            for(int j=0; j<n; j++) {
                b[j] = sc.nextInt();
            }
            
            for(int j=0; j<n; j++) {
                if(a[j]!=b[j]) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
    
}