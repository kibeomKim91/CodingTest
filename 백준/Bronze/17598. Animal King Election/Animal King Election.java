import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lion = 0;
        int tiger = 0;
        
        for(int i=0; i<9; i++) {
            String str = sc.nextLine();
            
            if(str.equals("Lion")) {
                lion++;
            } else {
                tiger++;
            }
        }
        
        if(lion >= 5) {
            System.out.print("Lion");
        } else {
            System.out.print("Tiger");
        }
    }
    
}