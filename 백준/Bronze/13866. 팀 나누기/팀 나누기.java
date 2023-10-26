import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        
        for(int i=0; i<4; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int a = arr[0] + arr[3];
        int b = arr[1] + arr[2];
        
        if(a >= b) {
            System.out.print(a-b);
        } else {
            System.out.print(b-a);
        }
    }
    
}