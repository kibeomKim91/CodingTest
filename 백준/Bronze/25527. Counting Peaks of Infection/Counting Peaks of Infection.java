import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            
            if(n == 0) {
                break;
            }
            
            int[] arr = new int[n];
            int count = 0;
            
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for(int i=1; i<n-1; i++) {
                if(i>0 && i<n-1 && arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
    
}