import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] array = new int[n];
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
            
            if(arr[i] > array[i]) {
                sum += 3;
            } else if(arr[i] == array[i]) {
                sum++;
            }
        }
        
        System.out.print(sum);
    }
    
}