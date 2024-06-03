import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        int first = 1;
        int second = 0;
        int third = 0;
        int copy = 0;
        
        for(int i=0; i<strLength; i++) {
            char ch = str.charAt(i);
            
            if(ch == 'A') {
                copy = first;
                first = second;
                second = copy;
            } else if(ch == 'B') {
                copy = second;
                second = third;
                third = copy;
            } else {
                copy = first;
                first = third;
                third = copy;
            }
        }
        
        if(first == 1) {
            System.out.print(1);
        } else if(second == 1) {
            System.out.print(2);
        } else {
            System.out.print(3);
        }
    }
    
}