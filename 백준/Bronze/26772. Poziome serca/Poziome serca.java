import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<9; i++) {
            for(int j=0; j<n; j++) {
                if(i == 0) {
                    System.out.print(" @@@   @@@ " + " ");
                } else if(i == 1) {
                    System.out.print("@   @ @   @" + " ");
                } else if(i == 2) {
                    System.out.print("@    @    @" + " ");
                } else if(i == 3) {
                    System.out.print("@         @" + " ");
                } else if(i == 4) {
                    System.out.print(" @       @ " + " ");
                } else if(i == 5) {
                    System.out.print("  @     @  " + " ");
                } else if(i == 6) {
                    System.out.print("   @   @   " + " ");
                } else if(i == 7) {
                    System.out.print("    @ @    " + " ");
                } else if(i == 8) {
                    System.out.print("     @     " + " ");
                }                
            }
            
            System.out.println();
        }
    }
    
}