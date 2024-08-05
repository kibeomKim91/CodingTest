import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        int uFirstIndex = 0;
        int fLastIndex = 0;
        
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i)=='U') {
                uFirstIndex = i;
                break;
            }
        }
        
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i)=='F') {
                fLastIndex = i;
            }
        }
        
        for(int i=0; i<strLength; i++) {
            if(i<uFirstIndex || i>fLastIndex) {
                System.out.print('-');
            } else if(i>uFirstIndex && i<fLastIndex) {
                System.out.print('C');
            } else if(i==uFirstIndex) {
                System.out.print('U');
            } else if(i==fLastIndex) {
                System.out.print('F');
            }
        }
    }
    
}