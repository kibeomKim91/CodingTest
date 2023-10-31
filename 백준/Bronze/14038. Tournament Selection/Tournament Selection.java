import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        
        for(int i=0; i<6; i++) {
            char ch = sc.next().charAt(0);
            
            if(ch == 'W') {
                win++;
            }
        }
        
        if(win == 6 || win == 5) {
            System.out.print(1);
        } else if(win == 4 || win == 3) {
            System.out.print(2);
        } else if(win == 2 || win == 1) {
            System.out.print(3);
        } else {
            System.out.print(-1);
        }
    }
    
}