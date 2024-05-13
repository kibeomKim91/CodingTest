import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];
        int max = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt()-1;
            arr[num]++;
        }
        
        for(int i=0; i<1000; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        
        System.out.print(max);
    }
    
}