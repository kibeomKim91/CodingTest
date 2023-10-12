import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        
        int[] time = {3, 20, 120};
        
        for(int i=0; i<3; i++) {
            a += sc.nextInt() * time[i];
        }
        
        for(int i=0; i<3; i++) {
            b += sc.nextInt() * time[i];
        }
        
        if(a > b) {
            System.out.print("Max");
        } else if(a == b) {
            System.out.print("Draw");
        } else {
            System.out.print("Mel");
        }        
    }
    
}