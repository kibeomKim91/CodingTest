import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            if(!sc.hasNext()) {
                break;
            }
            
            String name = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            
            for(char ch : name.toCharArray()) {
                if(ch == 'e') {
                    sb.append('i');
                } else if(ch == 'i') {
                    sb.append('e');
                } else if(ch == 'E') {
                    sb.append('I');
                } else if(ch == 'I') {
                    sb.append('E');
                } else {
                    sb.append(ch);
                }
            }
            
            System.out.println(sb.toString());
        }
    }
    
}