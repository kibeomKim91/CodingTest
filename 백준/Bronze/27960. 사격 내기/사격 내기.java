import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = {512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] array = new int[10];
        int sum = 0;
        
        for(int i=0; i<10; i++) {
            if(a/arr[i] == 1) {
                array[i]++;
                a -= arr[i];
            }
            
            if(b/arr[i] == 1) {
                array[i]++;
                b -= arr[i];
            }
        }
        
        for(int i=0; i<10; i++) {
            if(array[i] == 1) {
                sum += arr[i];
            }
        }
        
        System.out.print(sum);
    }
    
}