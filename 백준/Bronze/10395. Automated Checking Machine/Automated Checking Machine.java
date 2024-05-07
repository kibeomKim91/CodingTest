import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i=0; i<2; i++) {
            for(int j=0; j<5; j++) {
                int n = sc.nextInt();
                
                if(n == 1) {
                    arr[j]++;
                }
            }
        }
        
        if(arr[0] == arr[1] && arr[1] == arr[2] 
           && arr[2] == arr[3] && arr[3] == arr[4] && arr[4] == 1) {
            System.out.print('Y');
        } else {
            System.out.print('N');
        }
    }
    
}