import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        int count = 0;
        
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i) == '@') {
                count++;
            } else if(str.charAt(i) == '(') {
                System.out.print(count+" ");
                count = 0;
                i += 4;
            }
        }
            
        System.out.print(count);
    }
    
}