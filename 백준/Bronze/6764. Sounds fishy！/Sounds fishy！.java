import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int incCount = 0;
        int decCount = 0;
        int sameCount = 0;
        
        int a = sc.nextInt();
        for(int i=0; i<3; i++) {
            int b = sc.nextInt();
            
            if(a < b) {
                incCount++;
                a = b;
            } else if(a > b) {
                decCount++;
                a = b;
            } else if(a == b) {
                sameCount++;
                a = b;
            }
        }
        
        if(incCount == 3) {
            System.out.print("Fish Rising");
        } else if(decCount == 3) {
            System.out.print("Fish Diving");
        } else if(sameCount == 3) {
            System.out.print("Fish At Constant Depth");
        } else {
            System.out.print("No Fish");
        }
    }
    
}