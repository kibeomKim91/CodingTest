import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
        
        if(n%(k-m) == 0) {
            result = n/(k-m);
        } else {
            result = n/(k-m)+1;
        }
        
        System.out.print(result);
    }
    
}