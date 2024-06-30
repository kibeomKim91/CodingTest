import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        String first = str.substring(0, strLength/2);
        String second = str.substring(strLength/2);
        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);
        int resultFirst = 0;
        int resultSecond = 0;
        
        for(int i=0; i<strLength/2; i++) {
            resultFirst += firstNum%10;
            resultSecond += secondNum%10;
            firstNum /= 10;
            secondNum /= 10;
        }
        
        if(resultFirst==resultSecond) {
            System.out.print("LUCKY");
        } else {
            System.out.print("READY");
        }
    }
    
}