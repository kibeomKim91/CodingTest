import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        
        if(sum%x==0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
    
}