import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[5];
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            
            for(int j=0; j<5; j++) {
                if(str.charAt(j) == 'Y') {
                    arr[j]++;
                }
            }
        }
        
        int max = 0;
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        
        int count = 0;
        for(int i=0; i<5; i++) {
            if(arr[i] == max) {
                if(count > 0) {
                    System.out.print(",");
                }
                
                System.out.print(i+1);
                count++;
            }
        }
    }
    
}