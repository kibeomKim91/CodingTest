import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mingook = 0;
        int manse = 0;
        
        for(int i=0; i<4; i++) {
            mingook += sc.nextInt();
        }
        
        for(int i=0; i<4; i++) {
            manse += sc.nextInt();
        }
        
        if(mingook >= manse) {
            System.out.print(mingook);
        } else {
            System.out.print(manse);
        }
    }
    
}