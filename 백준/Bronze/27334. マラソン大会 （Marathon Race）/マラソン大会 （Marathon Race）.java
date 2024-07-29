import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrSort = new int[n];
        int num = 1;
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            arrSort[i] = arr[i];
        }
        
        Arrays.sort(arrSort);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(arr[i] == arrSort[j]) {
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
    
}