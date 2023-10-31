import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] arr = new int[3];
        
        arr[0] = b*2 + c*4;
        arr[1] = a*2 + c*2;
        arr[2] = a*4 + b*2;
        
        Arrays.sort(arr);
        
        System.out.print(arr[0]);
    }
    
}