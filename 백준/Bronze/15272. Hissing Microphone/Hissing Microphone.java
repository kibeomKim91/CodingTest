import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        
        for(int i=0; i<strLength-1; i++) {
            if(str.charAt(i) == 's' && str.charAt(i+1) == 's') {
                System.out.print("hiss");
                return;
            }
        }
        
        System.out.print("no hiss");     
    }
    
}