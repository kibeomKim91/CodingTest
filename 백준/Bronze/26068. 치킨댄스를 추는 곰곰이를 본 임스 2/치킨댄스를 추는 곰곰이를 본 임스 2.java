import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            String[] arr = str.split("-");
            int a = Integer.parseInt(arr[1]);
            
            if(a <= 90) {
                count++;
            }
        }
        
        System.out.print(count);
    }
    
}