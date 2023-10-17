import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int b = 0;
        int c = 0;
        int num = 0;
        int strLength = str.length();
        
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i) == 'B') {
                b++;
            } else if(str.charAt(i) == 'C') {
                c++;
            }
        }
        
        num = b/2 + c/2;
        System.out.print(num);
    }
    
}