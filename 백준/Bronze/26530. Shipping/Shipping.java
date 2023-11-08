import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            sc.nextLine();
            double sum = 0;
            
            for(int j=0; j<m; j++) {
                String str = sc.nextLine();
                String[] arr = str.split(" ");
                
                sum += Integer.parseInt(arr[1]) * Double.parseDouble(arr[2]);
            }
            
            System.out.printf("$%.2f\n", sum);
        }
    }
    
}