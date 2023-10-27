import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        int a = 0;
        int b = 0;
        char ch = '0';
        
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i) == '1') {
                continue;
            }
            
            if(str.charAt(i) == 'A') {
                ch = 'A';
                a++;
            } else if(str.charAt(i) == 'B') {
                ch = 'B';
                b++;
            }
            
            if(str.charAt(i) == '2') {
                if(ch == 'A') {
                    a++;
                } else if(ch == 'B') {
                    b++;
                }
            }
            
            if(a == 11 && b <= 9) {
                System.out.print('A');
                break;
            } else if(b == 11 && a <= 9) {
                System.out.print('B');
                break;
            } else if(a >= 10 && b >= 10) {
                if(a >= b+2) {
                    System.out.print('A');
                    break;
                } else if(b >= a+2) {
                    System.out.print('B');
                    break;
                }
            }
        }
    }
    
}