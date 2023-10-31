import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str.length());
        
        for(char ch : str.toCharArray()) {
            if(ch == 'a') {
                sb.append(4);
            } else if(ch == 'e') {
                sb.append(3);
            } else if(ch == 'i') {
                sb.append(1);
            } else if(ch == 'o') {
                sb.append(0);
            } else if(ch == 's') {
                sb.append(5);
            } else {
                sb.append(ch);
            }
        }
        
        System.out.print(sb.toString());
    }
    
}