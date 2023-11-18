import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int[] arr = new int[4];
        
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'N') {
                arr[0]++;
            } else if(str.charAt(i) == 'S') {
                arr[1]++;
            } else if(str.charAt(i) == 'E') {
                arr[2]++;
            } else if(str.charAt(i) == 'W') {
                arr[3]++;
            } 
        }
        
        Arrays.sort(arr);
        
        System.out.print(arr[0] + arr[1] + arr[2]);
    }
    
}