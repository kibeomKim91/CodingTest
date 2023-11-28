import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            double[] arr = new double[n];
            
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextDouble();
            }
            
            for(int j=0; j<n-2; j++) {
                if(arr[j+1] > (arr[j]+arr[j+2])/2) {
                    arr[j+1] = (arr[j]+arr[j+2])/2;
                }                
            }
            
            System.out.printf("Case #%d: %.6f\n", i+1, arr[n-2]);
        }
    }
    
}