import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        
        for(int i=a; i<=b; i++) {
            String str = Integer.toString(i);
            
            for(int j=0; j<4; j++) {
                if(str.charAt(j)-'0' == c) {
                    count++;
                }
            }
        }
        
        System.out.print(count);
    }
    
}