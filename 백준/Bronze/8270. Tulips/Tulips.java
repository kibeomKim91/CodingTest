import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15000];
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            arr[num-1]++;
        }
        
        for(int i=0; i<15000; i++) {
            if(arr[i]>0) {
                count++;
            }
        }
        
        System.out.print(15000-count);
    }
    
}