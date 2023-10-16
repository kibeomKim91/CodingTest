import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        int arrSum = 0;
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            arrSum += arr[i];
        }
        
        for(int i=0; i<n; i++) {
            System.out.println(d / arrSum * arr[i]);
        }
    }
    
}