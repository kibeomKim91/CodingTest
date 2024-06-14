import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = 0;
        int e = 0;
        
        for(int i=0; i<4; i++) {
            g += sc.nextInt();
        }
        
        for(int i=0; i<4; i++) {
            e += sc.nextInt();
        }
        
        if(g > e) {
            System.out.print("Gunnar");
        } else if(e > g) {
            System.out.print("Emma");
        } else {
            System.out.print("Tie");
        }
    }
    
}