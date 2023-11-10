import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int punch = sc.nextInt();
            
            if(punch >= a && punch <= b) {
                sum++;
            }
        }
        
        System.out.print(sum);
    }
    
}