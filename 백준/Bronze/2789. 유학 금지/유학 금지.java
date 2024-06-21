import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        int strLength = str.length();
        
        for(int i=0; i<strLength; i++) {
            char ch = str.charAt(i);            
            if(ch=='A' || ch=='B' || ch=='C' || ch=='D' || ch=='E'
              || ch=='G' || ch=='I' || ch=='M' || ch=='R') {
                continue;
            }
            
            result += ch;
        }
        
        System.out.print(result);
    }
    
}