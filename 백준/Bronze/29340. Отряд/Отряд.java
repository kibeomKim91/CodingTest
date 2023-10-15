import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputA = sc.nextLine();
        String inputB = sc.nextLine();
        int strLength = inputA.length();
        StringBuilder sb = new StringBuilder(strLength);
        
        for(int i=0; i<strLength; i++) {
            int a = Character.getNumericValue(inputA.charAt(i));
            int b = Character.getNumericValue(inputB.charAt(i));
            
            if(a >= b) {
                sb.append(inputA.charAt(i));
            } else {
                sb.append(inputB.charAt(i));
            }
        }
        
        System.out.print(sb.toString());
    }
    
}