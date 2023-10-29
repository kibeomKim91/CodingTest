import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int m = 0;
        int o = 0;
        int b = 0;
        int i = 0;
        int s = 0;
        
        for(char ch : str.toCharArray()) {
            if(ch == 'M') {
                m = 1;
            } else if(ch == 'O') {
                o = 1;
            } else if(ch == 'B') {
                b = 1;
            } else if(ch == 'I') {
                i = 1;
            } else if(ch == 'S') {
                s = 1;
            } 
        }
        
        if(m+o+b+i+s == 5) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
    
}