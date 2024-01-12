import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
            String[] arr = sc.nextLine().split(" ");
            int arrLength = arr.length;
            int sum = 0;
            
            for(int j=0; j<arrLength; j++) {
                int num = Integer.parseInt(arr[j]);
                sum += num;
            }
            
            System.out.println(sum);
        }
    }
    
}