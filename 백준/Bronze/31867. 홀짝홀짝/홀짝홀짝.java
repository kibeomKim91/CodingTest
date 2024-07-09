import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int hole = 0;
        int jjack = 0;
        
        for(int i=0; i<n; i++) {
            int num = str.charAt(i)-'0';
            
            if(num%2 == 0) {
                jjack++;
            } else {
                hole++;
            }
        }
        
        if(jjack > hole) {
            System.out.print(0);
        } else if(hole > jjack) {
            System.out.print(1);
        } else {
            System.out.print(-1);
        }
    }
    
}