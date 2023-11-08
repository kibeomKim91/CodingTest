import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        while(i < str.length()) {
            sb.append(str.charAt(i));
            i += str.charAt(i) - 'A' + 1;
        }
        
        System.out.print(sb.toString());
    }
    
}