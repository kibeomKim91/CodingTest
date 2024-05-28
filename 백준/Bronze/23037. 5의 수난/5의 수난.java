import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<5; i++) {
            int num = n%10;
            sum += num*num*num*num*num;
            n /= 10;
        }
        
        System.out.print(sum);
    }
    
}