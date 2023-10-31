import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'N';
        
        for(int i=0; i<10; i++) {
            int n = sc.nextInt();
            
            if((ch == 'N' && n == 1) || (ch == 'S' && n == 3) || (ch == 'W' && n == 2)) {
                ch = 'E';
            } else if((ch == 'S' && n == 1) || (ch == 'N' && n == 3) || (ch == 'E' && n == 2)) {
                ch = 'W';
            } else if((ch == 'E' && n == 1) || (ch == 'W' && n == 3) || (ch == 'N' && n == 2)) {
                ch = 'S';
            } else if((ch == 'W' && n == 1) || (ch == 'E' && n == 3) || (ch == 'S' && n == 2)) {
                ch = 'N';
            }
        }
        
        System.out.print(ch);
    }
    
}