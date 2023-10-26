import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 0;
        int y = 0;
        
        for(int i=0; i<n; i++) {
            char ch = sc.next().charAt(0);
            
            if(x+2 == y || y+2 == x) {
                continue;
            }
            
            if(ch == 'D') {
                x++;
            } else if(ch == 'P') {
                y++;
            }            
        }
        
        System.out.print(x + ":" + y);
    }
    
}