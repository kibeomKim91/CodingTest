import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strLength = str.length();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strLength; i++) {
            if(str.charAt(i) == 'e') {
                sb.append("ee");
            } else {
                sb.append(str.charAt(i));
            }
        }
        
        System.out.print(sb.toString());
    }
    
}