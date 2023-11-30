import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;
            
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
            }
            
            for(int j=1; j<n-1; j++) {
                if(arr[j] > arr[j-1] && arr[j] > arr[j+1]) {
                    count++;
                }
            }
            
            System.out.println("Case #"+(i+1)+": "+count);
        }
    }
    
}