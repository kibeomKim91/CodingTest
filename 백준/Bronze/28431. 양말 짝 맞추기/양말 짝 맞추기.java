import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        for(int i=0; i<5; i++) {
            int n = sc.nextInt();
            arr[n]++;
        }
        
        for(int i=0; i<10; i++) {
            if(arr[i] == 1 || arr[i] == 3 || arr[i] == 5) {
                System.out.print(i);
                break;
            }
        }
    }
    
}