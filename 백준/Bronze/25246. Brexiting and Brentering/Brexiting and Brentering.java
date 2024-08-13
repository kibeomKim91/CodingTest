import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        int strLength = str.length();
        int lastVowelIndex = 0;
        
        for(int i=0; i<strLength; i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                lastVowelIndex = i;
            }
        }
        
        result = str.substring(0, lastVowelIndex+1)+"ntry";
        System.out.print(result);
    }
    
}