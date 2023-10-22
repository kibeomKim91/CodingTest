import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = 0;
        int two = 0;
        
        for(int i=0; i<3; i++) {
            int n = sc.nextInt();
            
            if(n == 1) {
                one++;
            } else if(n == 2) {
                two++;
            }            
        }
        
        if(one > two) {
            System.out.print(1);
        } else if(two > one) {
            System.out.print(2);
        } else {
            System.out.print(1);
        }
    }
    
}