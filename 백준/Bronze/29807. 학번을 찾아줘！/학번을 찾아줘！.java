import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        if(arr[0] > arr[2]) {
            sum = (arr[0] - arr[2]) * 508;
        } else {
            sum = (arr[2] - arr[0]) * 108;
        }
        
        if(arr[1] > arr[3]) {
            sum += (arr[1] - arr[3]) * 212;
        } else {
            sum += (arr[3] - arr[1]) * 305;
        }
        
        if(n == 5) {
            sum += arr[4] * 707;
        }
        
        System.out.print(sum * 4763);
    }
    
}