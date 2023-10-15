import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ah = sc.nextInt() * 3;
        int ab = sc.nextInt();
        int bh = sc.nextInt() * 3;
        int bb = sc.nextInt();
        
        int aScore = ah + ab;
        int bScore = bh + bb;
        
        if(aScore > bScore) {
            System.out.print(1 + " " + (aScore-bScore));
        } else if(aScore == bScore) {
            System.out.print("NO SCORE");
        } else {
            System.out.print(2 + " " + (bScore-aScore));
        }
    }
    
}