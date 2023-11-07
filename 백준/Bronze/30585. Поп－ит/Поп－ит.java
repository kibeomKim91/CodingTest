import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int one = 0;
        int zero = 0;
        
        for(int i=0; i<a; i++) {
            String str = sc.nextLine();            
            
            for(int j=0; j<b; j++) {
                if(str.charAt(j) == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
        }
        
        if(one <= zero) {
            System.out.print(one);
        } else {
            System.out.print(zero);
        }
    }
    
}