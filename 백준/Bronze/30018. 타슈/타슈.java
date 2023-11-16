import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            
            if(x < arr[i]) {
                sum += arr[i] - x;
            }
        }
        
        System.out.print(sum);
    }
    
}