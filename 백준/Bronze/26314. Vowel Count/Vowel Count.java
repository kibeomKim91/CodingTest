import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            String name = sc.next();
            int nameLength = name.length();
            int consonantCount = 0;
            int vowelCount = 0;
            
            for(int j=0; j<nameLength; j++) {
                char ch = name.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
            
            System.out.println(name);
            
            if(vowelCount > consonantCount) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
    
}