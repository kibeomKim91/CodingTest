import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(",");
        int n = arr.length;
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        
        System.out.print(sum);
    }
    
}