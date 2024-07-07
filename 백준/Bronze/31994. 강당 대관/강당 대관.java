import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String result = "";
        
        for(int i=0; i<7; i++) {
            String str = sc.next();
            int num = sc.nextInt();
            
            if(num>max) {
                max = num;
                result = str;
            }
        }
        
        System.out.print(result);
    }
    
}