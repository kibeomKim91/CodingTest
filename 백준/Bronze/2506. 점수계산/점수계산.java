import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int bonus = 0;
        
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            
            if(num == 1) {
                sum += num + bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }
        
        System.out.print(sum);
    }
    
}