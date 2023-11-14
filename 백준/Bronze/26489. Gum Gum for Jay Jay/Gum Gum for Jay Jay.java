import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        
        while(true) {
            if(!sc.hasNext()) {
                break;
            }
            
            String str = sc.nextLine();
            count++;
        }
        
        System.out.print(count);
    }
    
}