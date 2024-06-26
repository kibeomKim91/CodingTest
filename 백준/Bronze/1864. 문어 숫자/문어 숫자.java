import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String str = sc.next();
            if(str.equals("#")) {
                break;
            }
            
            int strLength = str.length();
            int sum = 0;
            
            for(int i=0; i<strLength; i++) {
                int num = 0;
                char ch = str.charAt(i);
                
                if(ch=='\\') {
                    num = 1;
                } else if(ch=='(') {
                    num = 2;
                } else if(ch=='@') {
                    num = 3;
                } else if(ch=='?') {
                    num = 4;
                } else if(ch=='>') {
                    num = 5;
                } else if(ch=='&') {
                    num = 6;
                } else if(ch=='%') {
                    num = 7;
                } else if(ch=='/') {
                    num = -1;
                }
                
                sum += (int) Math.pow(8, strLength-1-i) * num;
            }
            
            System.out.println(sum);
        }
    }
    
}