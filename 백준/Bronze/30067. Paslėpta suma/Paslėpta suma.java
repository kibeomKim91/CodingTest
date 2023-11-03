import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0; 
        
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        for(int i=0; i<10; i++) {
            if(sum - arr[i] == arr[i]) {
                System.out.print(arr[i]);
                break;
            }
        }
    }
    
}