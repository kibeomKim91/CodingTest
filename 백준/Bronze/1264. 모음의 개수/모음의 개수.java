import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        while(true) {
            String str = sc.nextLine();
            int count = 0;
            
            if(str.charAt(0) == '#') {
                break;
            }
            
            for(char ch : str.toCharArray()) {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
    
}