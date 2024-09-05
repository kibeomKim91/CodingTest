import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            if(n==0) {
                break;
            }
            
            int[] arr = new int[n];            
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for(int i=n-1; i>=0; i--) {
                System.out.println(arr[i]);
            }
            
            System.out.println(0);
        }
    }
    
}