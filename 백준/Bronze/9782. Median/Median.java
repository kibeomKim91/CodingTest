import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        
        while(true) {
            int n = sc.nextInt();
            
            if(n == 0) {
                break;
            }
            
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            
            if(n % 2 == 1) {
                System.out.println("Case " + num + ": " + (double)arr[n/2]);
            } else {
                System.out.println("Case " + num + ": " + ((double)arr[n/2-1]+arr[n/2])/2);
            }
            
            num++;
        }
    }
    
}