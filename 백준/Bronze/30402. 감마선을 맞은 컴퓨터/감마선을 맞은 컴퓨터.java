import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = 0;
        int b = 0;
        int g = 0;
        
        for(int i=0; i<15*15; i++) {
            char ch = sc.next().charAt(0);
            
            if(ch == 'w') {
                w++;
            } else if(ch == 'b') {
                b++;
            } else if(ch == 'g') {
                g++;
            }
        }
        
        if(w > 0) {
            System.out.print("chunbae");
        } else if(b > 0) {
            System.out.print("nabi");
        } else if(g > 0) {
            System.out.print("yeongcheol");
        } 
    }
    
}