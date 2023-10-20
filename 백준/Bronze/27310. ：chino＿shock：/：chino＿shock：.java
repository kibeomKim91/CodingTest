import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        int result = 0;
        
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i) == '_') {
                result += 5;
            }
        }
        
        result += strLength + 2;
        
        System.out.print(result);
    }
    
}