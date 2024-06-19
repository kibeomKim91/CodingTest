import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        int bonus = 0;
        
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            
            if(ch == 'O') {
                sum += i+1+bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }
        
        System.out.print(sum);
    }
    
}