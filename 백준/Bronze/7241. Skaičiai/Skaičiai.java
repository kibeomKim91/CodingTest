import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[6];
        
        arr[0] = a*100 + b*10 + c;
        arr[1] = a*100 + c*10 + b;
        arr[2] = b*100 + a*10 + c;
        arr[3] = b*100 + c*10 + a;
        arr[4] = c*100 + a*10 + b;
        arr[5] = c*100 + b*10 + a;
        
        Arrays.sort(arr);
        for(int i=0; i<6; i++) {
            if(arr[i] == x) {
                System.out.print(i+1);
                break;
            }
        }
    }
    
}