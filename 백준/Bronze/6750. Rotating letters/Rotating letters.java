import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        String result = "YES";
        
        for(int i=0; i<strLength; i++) {
            if(!(str.charAt(i) == 'I' ||
                str.charAt(i) == 'O' || 
                str.charAt(i) == 'S' || 
                str.charAt(i) == 'H' || 
                str.charAt(i) == 'Z' || 
                str.charAt(i) == 'X' || 
                str.charAt(i) == 'N')) {
                result = "NO";
            }
        }
        
        System.out.print(result);
    }
    
}