import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.next();
        int x = 0;
        int y = 0;
        
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'E') {
                x++;
            } else if(str.charAt(i) == 'W') {
                x--;
            } else if(str.charAt(i) == 'S') {
                y--;
            } else if(str.charAt(i) == 'N') {
                y++;
            }
        }
        
        if(x < 0) {
            x = -x;
        }
        
        if(y < 0) {
            y = -y;
        }
        
        System.out.print(x+y);
    }
    
}