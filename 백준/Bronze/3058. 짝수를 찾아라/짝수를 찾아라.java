import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int[] arr = new int[7];
            int sum = 0;
            
            for(int j=0; j<7; j++) {
                arr[j] = sc.nextInt();
                
                if(arr[j] % 2 == 0) {
                    sum += arr[j];
                }
            }
            
            System.out.print(sum);
            
            Arrays.sort(arr);            
            for(int j=0; j<7; j++) {
                if(arr[j] % 2 == 0) {
                    System.out.println(" "+arr[j]);
                    break;
                }
            }
        }
    }
    
}