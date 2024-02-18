import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        
        for(int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        
        String str = sc.next();
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        
        for(int i=0; i<3; i++) {
            if(str.charAt(i) == 'A') {
                System.out.print(a+" ");
            } else if(str.charAt(i) == 'B') {
                System.out.print(b+" ");
            } else if(str.charAt(i) == 'C') {
                System.out.print(c+" ");
            }
        }
    }
    
}